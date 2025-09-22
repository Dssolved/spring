package com.example.springdemo.service;

import com.example.springdemo.model.Items;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

	private final List<Items> items = new ArrayList<>();

	public ItemService() {
		items.add(new Items(1L, "Mac Book Pro", "8 GB RAM 255 GB SSD Intel Core i7", 1199.99));
		items.add(new Items(2L, "Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
		items.add(new Items(3L, "Mac Book Pro", "16 GB RAM 1000 GB SSD Apple M1", 1799.99));
		items.add(new Items(4L, "ASUS Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
		items.add(new Items(5L, "HP Laser Pro", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
		items.add(new Items(6L, "Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));
	}

	public List<Items> getAllItems() {
		return items;
	}
}
