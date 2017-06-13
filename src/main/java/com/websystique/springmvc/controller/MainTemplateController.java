package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainTemplateController {

	@RequestMapping(value="/home")
    public String getHomeTemplate() {
    	System.out.println("***********products-view");
    	return "products-view";	
    }
	
	@RequestMapping(value="/tshirt-view")
    public String getTShirtViewTemplate() {
    	System.out.println("***********tee-shirt-view");
    	return "tee-shirt-view";	
    }
	
	@RequestMapping(value="/shoppingbag")
    public String getShoppingBagTemplate() {
    	System.out.println("***********shopping-list-view");
    	return "shopping-list-view";	
    }
	
	@RequestMapping(value="/checkout")
    public String getCheckOutTemplate() {
    	System.out.println("***********checkout-view");
    	return "checkout-view";	
    }
}
