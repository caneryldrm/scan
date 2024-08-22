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
    @Column(nullable = false,length = 2)
    private String code;

    @Column(nullable = false)
    private String name;


}