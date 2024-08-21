package com.migscan.migscan.tables;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "kategori")
public class Category {

    @Id
    private String ad;
    private String kod;

}
