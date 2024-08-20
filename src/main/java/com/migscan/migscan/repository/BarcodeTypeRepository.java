package com.migscan.migscan.repository;

import com.migscan.migscan.entity.BarcodeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarcodeTypeRepository extends JpaRepository<BarcodeType, Long> {
}
