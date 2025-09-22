package com.example.springdemo.controller;

import com.example.springdemo.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private final ItemService itemService;

	public HomeController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping
	public String indexPage(Model model) {
		model.addAttribute("items", itemService.getAllItems());
		return "index";
	}
}
