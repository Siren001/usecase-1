package com.itemWithData.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ItemService {
	 List<Item> items =  new ArrayList<>(Arrays.asList(
			new Item("01","arya","Active"),
			new Item("02","Soap","Online"),
			new Item("03","Battery","Inactive")
			
			
			));
	public List<Item> displayAllItems(){
		return items;
	}
	public Item getItem(String itemID) {
		return items.stream().filter(t->t.getitemID().equals(itemID)).findFirst().get();
	}
	public void newTopic(Item i) {
		items.add(i);
		
	}
	public void updateItem(Item i, String itemID) {
		int ind=0;
		for(Item j : items) {
			if (j.getitemID().equals(itemID)) {
				items.set(ind, i);
				return;
			}
			ind++;
		}
		
	}
	public void deleteItemById(Item i, String itemID) {
		int ind=0;
		for(Item j : items) {
			if (j.getitemID().equals(itemID)) {
				items.remove(ind);
				return;
			}
			ind++;
		}
		
	}
	
}
