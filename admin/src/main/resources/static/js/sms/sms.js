//分页页数跳转
function pageGo(pageNum,pageSize){
    httpPost(pageNum,pageSize);
}
//按页数填写跳转
function pageNumGo(pageSize) {
    var pageNum = $("#exampleInputName2").val();
    httpPost(pageNum,pageSize);

}
//通用查询post方法
function httpPost(pageNum,pageSize) {
    $.post("../version/sms-page",{"pageNum":pageNum,"pageSize":pageSize},function(tabHtml){
        // alert(json);
        $("#listContent").html('');
        $("#listContent").html(tabHtml)
    });
}