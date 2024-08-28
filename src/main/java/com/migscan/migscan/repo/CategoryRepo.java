package com.migscan.migscan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.migscan.migscan.model.Category;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CategoryRepo extends JpaRepository<Category, Long> {

}
