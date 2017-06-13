<!DOCTYPE html>
<html lang="en" ng-app="myApp">
<head>

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

	<title>AngularJS Project</title>
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/main.css">

</head>
<body ng-controller="MainController as Main">

	<div class="container">
	
		<div class="row">
			<div class="col-xs-12">
				<div class="page-header clearfix" ng-controller="ShoppingBagController as ShoppingBag">
					<a href="#/shopping-bag" class="panel panel-primary shop-cart">
						<div class="panel-heading">
							<h3 class="panel-title">Shopping Bag</h3>
						</div>
						<div class="panel-body">
							{{ShoppingBag.items.length}} item(s) added
						</div>
					</a>
					<h1 class="text-blue"><a href="#/home">American Apparel</a> <small>Made in the USA - Sweatshop Free</small></h1>
				</div>
			</div>	
		</div>

		<ng-view></ng-view>
		
	</div>

	<loader-directive isloading="{{Main.isLoading}}"></loader-directive>

	<script src="resources/js/vendor/angular.min.js"></script>
	<script src="resources/js/vendor/angular-route.min.js"></script>
	<script src="resources/js/app.js"></script>
	
	<!-- Controllers -->
	<script src="resources/js/controllers/main-controller.js"></script>
	<script src="resources/js/controllers/products-controller.js"></script>
	<script src="resources/js/controllers/tee-shirt-controller.js"></script>
	<script src="resources/js/controllers/shopping-bag-controller.js"></script>
	<script src="resources/js/controllers/shopping-list-controller.js"></script>
	
	<!-- Services -->
	<script src="resources/js/services/http-service.js"></script>
	
	<!-- Factories -->
	<script src="resources/js/factories/selectors-factory.js"></script>
	<script src="resources/js/factories/tees-factory.js"></script>
	<script src="resources/js/factories/shopping-bag-factory.js"></script>
	
	<!-- Directives -->
	<script src="resources/js/directives/loader-directive.js"></script>
	<script src="resources/js/directives/tee-directive.js"></script>
	
	<!-- Filters -->
	<script src="resources/js/filters/sort-filter.js"></script>
	<script src="resources/js/filters/length-filter.js"></script>
	<script src="resources/js/filters/tee-sizes-filters.js"></script>
	<script src="resources/js/filters/tee-prices-filters.js"></script>
	<script src="resources/js/filters/capitalize-filter.js"></script>
	<script src="resources/js/filters/sum-filter.js"></script>
	
</body>
</html>