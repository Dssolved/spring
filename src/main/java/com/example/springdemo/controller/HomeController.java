package com.example.springdemo.controller;

import com.example.springdemo.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
	@Autowired
	private final ItemService itemService;

	@GetMapping
	public String indexPage(Model model) {
		model.addAttribute("items", itemService.getAllItems());
		return "index";
	}
}
