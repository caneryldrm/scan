package com.migscan.migscan.tables;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table (name = "urun")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ad", nullable = false, unique = true )
    private String ad;

    @Column(name = "kod", nullable = false, unique = true)
    private String kod;

    @Column(name = "kategori_kodu", nullable = false)
    private String kategori_kodu;

    @Column(name = "marka", nullable = false)
    private String marka;

    @Column(name = "birim", nullable = false)
    private String birim;
}
