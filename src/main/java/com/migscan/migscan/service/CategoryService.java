package com.migscan.migscan.service;

import com.migscan.migscan.repo.CategoryRepo;
import com.migscan.migscan.tables.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepo CategoryRepo;
    public List<Category> getAllCategories(){
        return CategoryRepo.findAll();
    }
    public Optional<Category> getCategoryByCode(String kod){
        return CategoryRepo.findById(kod);
    }
    public Category saveCategory(Category category){
        return CategoryRepo.save(category);
    }
    public void deleteCategoryByCode(String kod){
        CategoryRepo.deleteById(kod);
    }
}
