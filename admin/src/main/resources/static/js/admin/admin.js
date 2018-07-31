$(function(){
    var bodyTab = $("body");
    //权限控制相关按钮操作
    // var statusButtonClass = $(".auditStatus");
    var doctorObj = {};
    var doctorDtoJson = {};
    //按条件查询
    $("#searchBtn").on("click",function (event) {
        event.preventDefault();
        event.stopPropagation();
        fuzzySearchMethod();
        $.ajax({
            url : "../admin/getByCondition",
            data : doctorDtoJson,
            type : 'POST',
            async: false ,
            dataType : "html",
            error : function(XMLHttpRequest, textStatus, errorThrown) {
            },
            success : function(tabHtml) {
                $("#listContent").html('');
                $("#listContent").html(tabHtml)
                //重新绑定button
                setTimeout(function () {
                    $(".auditStatus").each(function (i) {
                        var _this = $(this);
                        _this.click(function(event){
                            event.preventDefault();
                            event.stopPropagation();
                            cerAudit(_this)
                        })
                    })
                },300)
            }
        });
    })
    $(".auditStatus").each(function (i) {
        var _this = $(this);
        console.log(_this);
        _this.click(function(event){
            event.preventDefault();
            event.stopPropagation();
            cerAudit(_this)
        })
    })
     // $(".auditStatus").on("click",function (event){
     //     event.preventDefault();
     //     event.stopPropagation();
     //     var _this = $(this);
     //
    function fuzzySearchMethod() {
        doctorObj.startTime = bodyTab.find('input[name="startTime"]').val();
     // }).val();
        doctorObj.endTime = bodyTab.find('input[name="endTime"]').val();
        doctorObj.id = bodyTab.find('input[name="userId"]').val();
        doctorObj.phone = $.trim(bodyTab.find('input[name="phone"]').val());
        doctorObj.name = $.trim(bodyTab.find('input[name="name"]').val());
        doctorObj.hospitalName =$.trim(bodyTab.find('input[name="hospitalName"]').val());
        doctorObj.idcardNum = $.trim(bodyTab.find('input[name="idcardNum"]').val());
        doctorObj.licenseType = $.trim(bodyTab.find('input[name="licenseType"]').val());
        doctorObj.licenseCode = $.trim(bodyTab.find('input[name="licenseCode"]').val());
        doctorObj.status = $('select[name="statusSelect"]').find("option:checked").attr("value");
        if(doctorObj.status == '1') doctorObj.status = '5';
        doctorDtoJson = {
            "startTime":doctorObj.startTime,
            "endTime":doctorObj.endTime,
            "doctorId":doctorObj.id,
            "phone":doctorObj.phone,
            "doctorName":doctorObj.name,
            "hospitalName":doctorObj.hospitalName,
            "status":doctorObj.status,
            "idcardNum":doctorObj.idcardNum,
            "licenseType":doctorObj.licenseType,
            "licenseCode":doctorObj.licenseCode
        }
    }
    //证件审核
    function cerAudit(_this) {
        var this_table = _this.closest(".doctorTable");
        var this_div = _this.closest(".doctorTable").find(".audit");
        var doctorId = $.trim(this_table.find(".doctorIdClass").val());
        var phone = $.trim(this_table.find(".phoneClass").val());
        var realName = $.trim(this_table.find(".realNameClass").val());
        var idcardNum = $.trim(this_table.find(".idcardNumClass").val());
        var licenseType = $.trim(this_table.find(".licenseTypeClass").val());
        var licenseCode = $.trim(this_table.find(".licenseCodeClass").val());
        //身份证15~18位校验正则规则
        var isIDCardRegx= /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
        var identifyRemarks = 'SUCCESS';
        var auditStatus = 1;
        if(_this.hasClass("passStatus")) {
            auditStatus = 2
        } else {
            auditStatus = 3;
        }
        //校验证件填入信息
        if(auditStatus == 2 && (idcardNum == null || idcardNum == '')) {
            alert("身份证填写不能为空!");
            return false;
        }else if(auditStatus == 2 && (licenseType == null || licenseType == '')) {
            alert("执照类型填写不能为空!");
            return false;
        }else if(auditStatus == 2 && (licenseCode == null || licenseCode == '')) {
            alert("执照编号填写不能为空")
            return false;
        }else if(auditStatus == 2 && ! isIDCardRegx.test(idcardNum)) {
            alert("身份证格式填写错误!")
            return false;
        } else {
            if(auditStatus == 3) {
                identifyRemarks = prompt("输入不通过原因：","")
                if("SUCCESS" == identifyRemarks || null == identifyRemarks) {
                    return;
                }
                var lengthTrue = true;
                while(lengthTrue) {
                    if($.trim(identifyRemarks) == "") {
                        identifyRemarks = prompt("输入的内容不能为空，请重新输入：","")
                        if("SUCCESS_OK" == identifyRemarks || null == identifyRemarks) lengthTrue = false;
                    } else if(identifyRemarks.length > 60) {
                        identifyRemarks = prompt("您输入的字符已超过60个，请控制字数重新输入!!","")
                    } else if(identifyRemarks.length <= 60) {
                        break;
                    }
                }
                if(!lengthTrue) return;
            }
            $.ajax({
                url : "../admin/updateDoctorUser",
                data : {'identifyStatus':auditStatus,'identifyRemarks':identifyRemarks,'doctorId':doctorId,'phone':phone,'doctorName':realName,
                    'idcardNum':idcardNum,'licenseType':licenseType,"licenseCode":licenseCode},
                type : 'POST',
                dataType : "json",
                async:false,
                error : function(XMLHttpRequest, textStatus, errorThrown) {
                },
                success : function(data) {
                    if(data.code == '00000'){
                        if(auditStatus == 2) {
                            this_table.find(".passStatus").hide();
                            this_table.find(".failStatus").hide();
                            this_div.empty();
                            this_div.append("<span> 审核通过</span>");
                        } else if(auditStatus == 3) {
                            this_table.find(".passStatus").hide();
                            this_table.find(".failStatus").hide();
                            this_div.empty();
                            this_div.append('<span> 审核不通过</span>');

                        }
                    }else{
                        alert(code, '操作失败');
                    }
                }
            });
        }
    }
})
