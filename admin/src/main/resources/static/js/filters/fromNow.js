'use strict';

/* Filters */
// need load the moment.js to use this filter. 
//app
//  .filter('fromNow', function() {
//  return function(date) {
//    return moment(date).fromNow();
//  }
//})


//.filter('to_mp3',['$http',function($http){
//  return function(data){
//    return 'http://120.55.168.228:9092/api/resource?id=' + data
//  }
//}])
(function(){
    angular.module("app") .filter('to_status', [function() {
        return function(data) {
            if(data==0){
                return "待审核"
            }
            else if(data == 1){
                return "审核通过"
            }
            else{
                return "审核不通过"
            }
        }
    }])
})()