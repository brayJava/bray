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
    $.post("../version/get-page",{"pageNum":pageNum,"pageSize":pageSize},function(tabHtml){
        // alert(json);
        $("#version_content").html('');
        $("#version_content").html(tabHtml)
    });
}
/*版本-添加*/
function version_add(title,url,w,h){
    layer_show(title,url,w,h);
}
//刷新界面
function version_reload(){
    window.location.reload()
}
//删除版本
function delVersion(versionID) {
    layer.confirm("确定要删除吗?", {icon: 3, title:'提示'}, function(index){
        $.post("../version/delete",{"versionID":versionID},function (data) {
            layer.alert('删除成功',{icon:1},function (index) {
                layer.close(index)
                version_reload();
            })
        })
    });
}