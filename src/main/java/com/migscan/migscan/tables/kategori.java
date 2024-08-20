package com.migscan.migscan.tables;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Data
@Entity
@Table (name = "kategori")
public class kategori {

    @Id
    private String ad;
    private String kod;

    public String getKategoriKod()
    {
        return kod;
    }

    public void setKategoriKod(String kod)
    {
        this.kod = kod;
    }

    public String getKategoriName()
    {
        return ad;
    }

    public void setKategoriName(String name)
    {
        this.ad = ad;
    }
}
