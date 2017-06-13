angular.module('myApp', ['ngRoute']);

/*
---
name: RouteConfig
...
*/
(function(global, doc, undefined){

	'use strict';

	var RouteConfig = function($routeProvider) {

		$routeProvider
		.when('/home', {
			templateUrl: 'home',
			controller: 'ProductsController',
			controllerAs: 'Products'
		})
		.when('/tee-shirt/:teeShirtId/:teeShirtSize?/:teeShirtColor?', {
			templateUrl: 'tshirt-view',
			controller: 'TeeShirtController',
			controllerAs: 'Product'
		})
		.when('/shopping-bag', {
			templateUrl: 'shoppingbag',
			controller: 'ShoppingListController',
			controllerAs: 'ShoppingList'
		})
		.when('/checkout', {
			templateUrl: 'checkout'
		})
		.otherwise({
			redirectTo: '/home'
		});

	};

	angular.module('myApp').config(['$routeProvider', RouteConfig]);

})(window, document);
