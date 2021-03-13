package com.szczygiel.pcbuildershop.controller;

import com.szczygiel.pcbuildershop.model.Category;
import com.szczygiel.pcbuildershop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping()
    public Category addCategory(@RequestBody Category category) {
        return categoryService.addCategory(category);
    }
}
