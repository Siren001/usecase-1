package com.itemWithData.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itemWithData.entities.Item;
import com.itemWithData.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService itemService;

	@RequestMapping(method = RequestMethod.GET, value ="/items/getall")
	public List<Item> returnAllItems() {
		return itemService.displayAllItems();

	}

	@RequestMapping(method = RequestMethod.GET, value ="/items/get/{itemID}")
	public Optional<Item> getItemByID(@PathVariable String itemID) {
		return itemService.getItem(itemID);
	}

	@PostMapping("/items/add")
	public void addItem(@RequestBody Item item) {
		itemService.newTopic(item);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/items/update/{itemID}")
	public void updateItem(@RequestBody Item item, @PathVariable String itemID) {
		itemService.updateItem(item, itemID);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/items/delete/{itemID}")
	public void deleteItem(@RequestBody Item i, @PathVariable String itemID) {
		itemService.deleteItemById(i, itemID);
	}
}
