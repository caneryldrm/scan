package com.migscan.migscan.tables;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class Product {
    private Long id;

    private String category_code;

    private String name;

    private String code;

    private String brand;

    private String unit;

}
