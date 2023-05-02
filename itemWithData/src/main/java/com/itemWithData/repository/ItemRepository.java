package com.itemWithData.repository;


import org.springframework.data.repository.CrudRepository;

import com.itemWithData.entities.Item;

public interface ItemRepository extends CrudRepository<Item, String> {}

