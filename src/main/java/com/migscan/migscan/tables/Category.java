package com.migscan.migscan.tables;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity (name = "category")
@Getter
@Setter
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 9)
    private String productCode;

    @Column(nullable = true,length = 8)
    private String teraziCode;

    @Column(nullable = true, length = 4)
    private String kasaCode;

}