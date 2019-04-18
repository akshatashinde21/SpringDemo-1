package com.example.myapp.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.myapp.models.Product;

@Controller
@RequestMapping("/products")
public class ProductController {
	
	 @RequestMapping("/")
	public String getProducts(Model model){
		 
		 model.addAttribute("pageTitle","My Custom Page Title");
	        model.addAttribute("products", createProducts());
	        return "views/products";
		
		
		
	}
	
	
	private List<Product> createProducts(){
		
		List <Product> list = new ArrayList<Product>();
		
		list.add(new Product(1,"toothPaste","very long product desc", 100.14,"P&G",new Date()));
		list.add(new Product(1,"Detergent","very long product desc",54.14,"Paras",new Date()));
		list.add(new Product(1,"Chairs","very long product desc",34.14,"Uniliver",new Date()));
		list.add(new Product(1,"Soap","very long product desc",324.14,"Godrej",new Date()));
		
		return list;
		
	}

}
