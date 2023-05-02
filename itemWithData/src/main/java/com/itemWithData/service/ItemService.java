package com.itemWithData.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itemWithData.entities.Item;
import com.itemWithData.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemrepo;

	public List<Item> displayAllItems() {
//		return items;
		List<Item> temp = new ArrayList<>();
		itemrepo.findAll().forEach(temp::add);
		return temp;
	}

	public Optional<Item> getItem(String itemID) {
//		return items.stream().filter(t->t.getitemID().equals(itemID)).findFirst().get();
		Optional<Item> temp = itemrepo.findById(itemID);
		return temp;
	}

	public void newTopic(Item i) {
//		items.add(i);
		itemrepo.save(i);
	}

	public void updateItem(Item i, String itemID) {
//		int ind=0;
//		for(Item j : items) {
//			if (j.getitemID().equals(itemID)) {
//				items.set(ind, i);
//				return;
//			}
//			ind++;
//		}
		itemrepo.save(i);

	}

	public void deleteItemById(Item i, String itemID) {
//		int ind=0;
//		for(Item j : items) {
//			if (j.getitemID().equals(itemID)) {
//				items.remove(ind);
//				return;
//			}
//			ind++;
//		}
		itemrepo.deleteById(itemID);

	}

}
