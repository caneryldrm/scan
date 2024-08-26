package com.migscan.migscan.service;


import com.migscan.migscan.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    /*
    private WebClient webClient;
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    public ProductService(WebClient.Builder webClientBuilder, ProductRepo productRepo) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081").defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE).build();
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    public Optional<Product> getProductById(Long id)
    {
        return productRepo.findById(id);
    }
    public Product saveProduct(Product product)
    {
        return productRepo.save(product);
    }
    public Optional<Product> getProductByCode(String code){
        return productRepo.findAll().stream().filter(product -> product.getCode().equals(code)).findAny();
    }
    public void deleteProductById(Long id)
    {
        productRepo.deleteById(id);
    }
    public Mono<Product> getProductFromOtherService(String id){
        return webClient.get().uri("/api/Products/{id}" , id).retrieve().bodyToMono(Product.class);
    }
    */
}
