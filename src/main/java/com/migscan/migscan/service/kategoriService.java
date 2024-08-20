package com.migscan.migscan.service;

import com.migscan.migscan.tables.kategori;
import com.migscan.migscan.repo.kategoriRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class kategoriService {
    @Autowired
    private kategoriRepo kategoriRepo;
    public List<kategori> getAllKategori(){
        return kategoriRepo.findAll();
    }
    public Optional<kategori> getKategoriByKod(String kod){
        return kategoriRepo.findById(kod);
    }
    public kategori saveKategori(kategori kategori){
        return kategoriRepo.save(kategori);
    }
    public void deleteKategoriByKod(String kod){
        kategoriRepo.deleteById(kod);
    }
}
