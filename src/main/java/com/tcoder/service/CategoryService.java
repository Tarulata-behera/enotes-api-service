package com.tcoder.service;

import java.util.List;

import com.tcoder.entity.Category;

public interface CategoryService {

	public Boolean saveCategory(Category category);
	
	public List<Category> getAllCategory();
}
