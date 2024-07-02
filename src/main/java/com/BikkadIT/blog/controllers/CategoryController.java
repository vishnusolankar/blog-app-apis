package com.BikkadIT.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.blog.payloads.CategoryDto;
import com.BikkadIT.blog.services.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// create
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto cateogDto) {
		CategoryDto createCategory = this.categoryService.createCategory(cateogDto);
		return new ResponseEntity<CategoryDto>(createCategory, HttpStatus.CREATED);
	}

	
	// This Method to handle PUT requests for updating a category
	@PutMapping("/{catId}")
	public ResponseEntity<CategoryDto> updateCategory(@RequestBody CategoryDto categoryDto,// The category data to update
			@PathVariable Integer catId) { //The ID of the category to update
		// Call the service to update the category and get the updated category
		CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto, catId);
		// Return the updated category with HTTP status 200 (OK)
		return new ResponseEntity<CategoryDto>(updatedCategory, HttpStatus.OK);

	}

	// delete

	//

}
