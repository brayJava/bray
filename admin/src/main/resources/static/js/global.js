$(function () {

    var URL = "";
    // $("#feedback_manage").click(function (event) {
    //     event.stopPropagation();
    //     URL = '../feed/pageGo';
    //     httpPost(1,10);
    // })
    // $("#adminaudit_manage").click(function (event) {
    //     event.stopPropagation();
    //     URL = '../admin/getByCondition';
    //     httpPost(1,10);
    // })
    //通用查询post方法
    function httpPost(pageNum,pageSize) {
        $.post(URL,{"pageNum":pageNum,"pageSize":pageSize},function(tabHtml){
            // alert(json);
            $("#contentTemplate").html('');
            $("#contentTemplate").html(tabHtml)
        });
    }
})