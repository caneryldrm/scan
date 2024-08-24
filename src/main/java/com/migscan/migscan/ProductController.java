package com.migscan.migscan;

import com.migscan.migscan.service.ProductService;
import com.migscan.migscan.tables.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/service1/Products")
public class ProductController {
    @Autowired
    private ProductService productService;
    //private WebClient webClient;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id)
    {
        return productService.getProductById(id);
    }

    @GetMapping("/external/{id}")
    public Mono<Product> getProductByIdexternal(@PathVariable String id){
        return productService.getProductFromOtherService(id);
    }
    @GetMapping("/code/{code}")
    public Optional<Product> getProductByCode(@PathVariable String code){
        return productService.getProductByCode(code);
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product)
    {
        return productService.saveProduct(product);
    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Long id)
    {
        productService.deleteProductById(id);
    }
}
