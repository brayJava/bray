var bodyTab = $("body");
var doctorObj = {};
var doctorDtoJson = {};
var certificateTypes = [
    'IDCARD_F',
    'IDCARD_B',
    'PHYSICIA_F',
    'PHYSICIA_B'
]
//默认页码
doctorDtoJson.pageNum = 1;
//默认展示条数
doctorDtoJson.pageSize = 10;
//分页页数跳转
function pageGo(pageNum,pageSize){
    fuzzySearchMethod();
    doctorDtoJson.pageNum = pageNum;
    doctorDtoJson.pageSize = pageSize;
    httpPost(doctorDtoJson.pageNum,doctorDtoJson.pageSize);
}
//按页数填写跳转
function pageNumGo(pageSize) {
    fuzzySearchMethod();
    doctorDtoJson.pageNum = $("#exampleInputName2").val();
    doctorDtoJson.pageSize = pageSize;
    httpPost(doctorDtoJson.pageNum,doctorDtoJson.pageSize);

}
function fuzzySearchMethod() {
    doctorObj.startTime = bodyTab.find('input[name="startTime"]').val();
    doctorObj.endTime = bodyTab.find('input[name="endTime"]').val();
    doctorObj.id = $("#userid").val();
    doctorObj.phone = $.trim(bodyTab.find('input[name="phone"]').val());
    doctorObj.name = $.trim(bodyTab.find('input[name="name"]').val());
    doctorObj.hospitalName = $.trim(bodyTab.find('input[name="hospitalName"]').val());
    doctorObj.idcardNum = $.trim(bodyTab.find('input[name="idcardNum"]').val());
    doctorObj.licenseType = $.trim(bodyTab.find('input[name="licenseType"]').val());
    doctorObj.licenseCode = $.trim(bodyTab.find('input[name="licenseCode"]').val());
    doctorObj.status = $('select[name="statusSelect"]').find("option:checked").attr("value");
    doctorDtoJson = {
        "startTime":doctorObj.startTime,
        "endTime":doctorObj.endTime,
        "id":doctorObj.id,
        "phone":doctorObj.phone,
        "doctorName":doctorObj.name,
        "hospitalName":doctorObj.hospitalName,
        "status":doctorObj.status,
        "idcardNum":doctorObj.idcardNum,
        "licenseType":doctorObj.licenseType,
        "licenseCode":doctorObj.licenseCode
    }
}
//通用查询post方法
function httpPost(pageNum,pageSize) {
    $.post("../admin/getByCondition",doctorDtoJson,function(tabHtml){
        // alert(json);
        $("#listContent").html('');
        $("#listContent").html(tabHtml)
    });
}
//展现证件图片
function showImage(path) {
    if(path == '00001') {
        // window.open('http://120.55.168.228:8848/api/image?id=1f8f8fa9efb1403cb29f0c95ba774715');
        window.open('http://192.168.1.119:8080/api/image?id=1f8f8fa9efb1403cb29f0c95ba774715');
    } else {
        // window.open('http://120.55.168.228:8848/api/image?id='+pathId);
        window.open(path);
    }
}
/*用户-添加*/
function show_image(title,url,w,h){
    w = 1000;
    h = 600;
    layer_show(title,url,w,h);
}