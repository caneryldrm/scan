package com.migscan.migscan.service;

import com.migscan.migscan.repo.CategoryRepo;
import com.migscan.migscan.tables.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private WebClient webClient;
    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    public CategoryService(WebClient.Builder webClientBuilder, CategoryRepo categoryRepo) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081").defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
        this.categoryRepo = categoryRepo;
    }

    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
    public Optional<Category> getCategoryById(Long id) {
     return categoryRepo.findById(id);
    }

    public Optional<Category> getCategoryByKasa(String name) {
        return categoryRepo.findAll().stream().filter(category -> category.getKasaCode().equals(name)).findFirst();
    }

    public Optional<Category> getCategoryByTerazi(String name) {
        return categoryRepo.findAll().stream().filter(category -> category.getTeraziCode().equals(name)).findFirst();
    }

    public Optional<Category> getCategoryByProduct(String productCode) {
        return categoryRepo.findAll().stream().filter(category -> category.getProductCode().equals(productCode)).findFirst();
    }
    public Category saveCategory(Category category)
    {
        return categoryRepo.save(category);
    }

    public void deleteCategoryById(Long id)
    {
        categoryRepo.deleteById(id);
    }

    public Mono<Category> getcategoryFromOtherService(String id){
        return webClient.get().uri("/api/categories/{id}" , id).retrieve().bodyToMono(Category.class);
    }
}
