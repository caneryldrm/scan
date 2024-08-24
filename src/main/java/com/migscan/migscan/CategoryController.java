package com.migscan.migscan;

import com.migscan.migscan.tables.Category;
import com.migscan.migscan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("/terazi/{terazi}")
    public Optional<Category> getCategoryByTerazi(@PathVariable String terazi){return CategoryService.getCategoryByTerazi(terazi);}
    @GetMapping("/kasa/{kasa}")
    public Optional<Category> getCategoryByKasa(@PathVariable String kasa){return CategoryService.getCategoryByKasa(kasa);}
    @GetMapping("/product/{product}")
    public Optional<Category> getCategoryByProduct(@PathVariable String product) {
        return CategoryService.getCategoryByProduct(product);
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategoryByCode(@PathVariable Long id)
    {
        return CategoryService.getCategoryById(id);
    }
    @PostMapping
    public Category createCategory(@RequestBody Category category)
    {
        return CategoryService.saveCategory(category);
    }
    @DeleteMapping("/{code}")
    public void deleteCategoryByCode(@PathVariable Long id)
    {
        CategoryService.deleteCategoryById(id);
    }

}
