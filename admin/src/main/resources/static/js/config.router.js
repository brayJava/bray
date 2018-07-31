'use strict';

/**
 * Config for the router
 */
angular.module('app')
  .run(
    [          '$rootScope', '$state', '$stateParams',
      function ($rootScope,   $state,   $stateParams) {
          $rootScope.$state = $state;
          $rootScope.$stateParams = $stateParams;        
      }
    ]
  )
  .config(
    [          '$stateProvider', '$urlRouterProvider','$locationProvider',
      function ($stateProvider,   $urlRouterProvider,$locationProvider) {
          //$locationProvider.hashPrefix("");
          //$locationProvider.html5Mode(true);
          //$urlRouterProvider
          //    .otherwise('/app/dashboard-v1');
          $urlRouterProvider
              .otherwise('/access/signin');
              // .otherwise('/app/list1');
          $stateProvider
              .state('app', {
                  abstract: true,
                  url: '/app',
                  templateUrl: 'tpl/app.html'
              })
              .state('app.list1', {
                  url: '/list1',
                  template: '<div ui-view><h1 class="font-bold text-center">Welcome to WhitePlanet</h1></div>',
                  resolve: {
                      deps: ['$ocLazyLoad',
                          function( $ocLazyLoad ){
                              return $ocLazyLoad.load(['js/controllers/index/list1.js']);
                          }]
                  }
              })
              .state('app.list1.list1v1', {
                  url: '/list1v1',
                  templateUrl: 'tpl/index/list1v1.html'
              })
              .state('app.list3', {
                  url: '/list3',
                  templateUrl: 'tpl/index/list3.html',
                  resolve: {
                      deps: ['$ocLazyLoad',
                          function( $ocLazyLoad ){
                              return $ocLazyLoad.load(['js/controllers/index/list3.js']);
                          }]
                  }
              })
              // pages
              .state('app.page', {
                  url: '/page',
                  template: '<div ui-view class="fade-in-down"></div>'
              })
              .state('app.page.profile', {
                  url: '/profile',
                  templateUrl: 'tpl/page_profile.html'
              })
              .state('app.page.post', {
                  url: '/post',
                  templateUrl: 'tpl/page_post.html'
              })
              .state('app.page.search', {
                  url: '/search',
                  templateUrl: 'tpl/page_search.html'
              })
              .state('app.page.invoice', {
                  url: '/invoice',
                  templateUrl: 'tpl/page_invoice.html'
              })
              .state('app.page.price', {
                  url: '/price',
                  templateUrl: 'tpl/page_price.html'
              })
              .state('app.docs', {
                  url: '/docs',
                  templateUrl: 'tpl/docs.html'
              })
              // others
              .state('lockme', {
                  url: '/lockme',
                  templateUrl: 'tpl/page_lockme.html'
              })
              .state('access', {
                  url: '/access',
                  template: '<div ui-view class="fade-in-right-big smooth"></div>'
              })
              .state('access.signin', {
                  'mainView': {
                      url: '/signin',
                      views:{
                          "":{
                              templateUrl: 'tpl/page_signin.html'
                              // resolve: {
                              //     deps: ['uiLoad',
                              //         function (uiLoad) {
                              //             return uiLoad.load(['js/controllers/signin.js']);
                              //         }]
                              // }
                          }
                      }
                  }

              })
              .state('access.signup', {
                  url: '/signup',
                  templateUrl: 'tpl/page_signup.html',
                  resolve: {
                      deps: ['uiLoad',
                        function( uiLoad ){
                          return uiLoad.load( ['js/controllers/signup.js'] );
                      }]
                  }
              })
              .state('access.forgotpwd', {
                  url: '/forgotpwd',
                  templateUrl: 'tpl/page_forgotpwd.html'
              })
              .state('access.404', {
                  url: '/404',
                  templateUrl: 'tpl/page_404.html'
              })
      }
    ]
  );