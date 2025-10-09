package com.tcoder.service;

import java.util.List;

import com.tcoder.dto.CategoryDto;
import com.tcoder.dto.CategoryResponse;

public interface CategoryService {

	public Boolean saveCategory(CategoryDto categoryDto);
	
	public List<CategoryDto> getAllCategory();

	public List<CategoryResponse> getActieCategory();

	public CategoryDto getCategoryById(Integer id);

	public Boolean deleteCategoryById(Integer id);
}
