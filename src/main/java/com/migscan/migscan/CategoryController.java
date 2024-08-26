package com.migscan.migscan;

import com.migscan.migscan.tables.Category;
import com.migscan.migscan.service.CategoryService;
import com.migscan.migscan.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Categories")
public class CategoryController
{
    @Autowired
    CategoryService CategoryService;
    @Autowired
    private CategoryService categoryService;

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
    @GetMapping("/external/{id}")
    public Mono<Product> getProductById(@PathVariable Long id){return CategoryService.getProductById(id);}
    @PostMapping
    public Category createCategory(@RequestBody Category category)
    {
        Category savedCategory = CategoryService.saveCategory(category);
        Long categoryId = savedCategory.getId();
        return savedCategory;
    }
    @PostMapping("/barcodeGenerator/{category_code}")
    public Category generateBarcodeForProduct(@RequestBody String category_code){
        System.out.println(category_code);
        return categoryService.createProductBarcode(category_code);
    }
    @DeleteMapping("/{code}")
    public void deleteCategoryByCode(@PathVariable Long id)
    {
        CategoryService.deleteCategoryById(id);
    }

}
