package com.migscan.migscan;

import com.migscan.migscan.tables.kategori;
import com.migscan.migscan.service.kategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/kategoriler")
public class kategoriController
{
    @Autowired
    kategoriService kategoriService;

    @GetMapping
    public List<kategori> getAllKategoriler()
    {
        return kategoriService.getAllKategori();
    }

    @GetMapping("/{kod}")
    public Optional<kategori> getkategoriByKod(@PathVariable String kod)
    {
        return kategoriService.getKategoriByKod(kod);
    }
    @PostMapping
    public kategori createKategori(@RequestBody kategori kategori)
    {
        return kategoriService.saveKategori(kategori);
    }
    @DeleteMapping("/{kod}")
    public void deleteKategori(@PathVariable String kod)
    {
        kategoriService.deleteKategoriByKod(kod);
    }

}
