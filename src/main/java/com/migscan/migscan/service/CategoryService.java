package com.migscan.migscan.service;


import com.migscan.migscan.repo.CategoryRepo;
import com.migscan.migscan.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepo categoryRepository;

    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    /*
    private WebClient webClient;
    @Autowired
    private CategoryRepo categoryRepo;

    private Random random = new Random();

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

    public Mono<Product> getProductById(Long id) {
        return webClient.get().uri("/api/Products/{id}", id).retrieve().bodyToMono(Product.class);
    }
    public Optional<Category> getCategoryByKasa(String name) {
        return categoryRepo.findAll().stream().filter(category -> category.getKasaCode().equals(name)).findFirst();
    }

    public Category createProductBarcode(String category_code){
        Category category = new Category();
        category.setProductCode(generateRandomBarcode(category_code,9,2));
        category.setKasaCode(generateRandomBarcode(category_code,4,2));
        category.setTeraziCode(generateRandomBarcode(category_code,8,2));
        saveCategory(category);
        return category;
    }

    private String generateRandomBarcode(String code, int length,int startIndex)
    {
        String barcodeLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder barcode = new StringBuilder (code);
        for(int i = startIndex; i < length; i++)
        {
            int index = random.nextInt(barcodeLetter.length());
            barcode.append(barcodeLetter.charAt(index));
        }
        return barcode.toString();
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
    */
}
