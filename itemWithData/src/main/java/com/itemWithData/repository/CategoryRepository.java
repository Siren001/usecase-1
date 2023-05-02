package com.itemWithData.repository;


import org.springframework.data.repository.CrudRepository;

import com.itemWithData.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {}

