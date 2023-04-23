package com.itemWithData.Item;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepo extends CrudRepository<Item, String> {
	
}
