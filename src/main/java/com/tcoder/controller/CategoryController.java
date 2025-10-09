package com.tcoder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcoder.dto.CategoryDto;
import com.tcoder.dto.CategoryResponse;
import com.tcoder.entity.Category;
import com.tcoder.service.CategoryService;

@RestController
@RequestMapping("/api/v1/Category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/save-category")
	public ResponseEntity<?> saveCategory(@RequestBody CategoryDto categoryDto){
		Boolean saveCategory = categoryService.saveCategory(categoryDto);
		if(saveCategory) {
			return new ResponseEntity<>("saved success",HttpStatus.CREATED);
		}
		return new ResponseEntity<>("not saved",HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@GetMapping("/category")
	public ResponseEntity<?> getAllCategory(){
		List<CategoryDto> allCategory = categoryService.getAllCategory();
		if(CollectionUtils.isEmpty(allCategory)) {
			return ResponseEntity.noContent().build();
		}
		return new ResponseEntity<>(allCategory,HttpStatus.OK);
	}
	
	@GetMapping("/active-category")
	public ResponseEntity<?> getActiveCategory(){
		List<CategoryResponse> allCategory = categoryService.getActieCategory();
		if(CollectionUtils.isEmpty(allCategory)) {
			return ResponseEntity.noContent().build();
		}
		return new ResponseEntity<>(allCategory,HttpStatus.OK);
	}
}

	
