package com.tcoder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcoder.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	List<Category> findByIsActiveTrue();



}
