package com.migscan.migscan;

import com.migscan.migscan.tables.Category;
import com.migscan.migscan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Categories")
public class CategoryController
{
    @Autowired
    CategoryService CategoryService;

    @GetMapping
    public List<Category> getAllCategories()
    {
        return CategoryService.getAllCategories();
    }

    @GetMapping("/{code}")
    public Optional<Category> getCategoryByCode(@PathVariable String code)
    {
        return CategoryService.getCategoryByCode(code);
    }
    @PostMapping
    public Category createCategory(@RequestBody Category category)
    {
        return CategoryService.saveCategory(category);
    }
    @DeleteMapping("/{code}")
    public void deleteCategoryByCode(@PathVariable String code)
    {
        CategoryService.deleteCategoryByCode(code);
    }

}
