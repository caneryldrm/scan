package com.migscan.migscan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.migscan.migscan.tables.kategori;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface kategoriRepo extends JpaRepository<kategori, String> {

}
