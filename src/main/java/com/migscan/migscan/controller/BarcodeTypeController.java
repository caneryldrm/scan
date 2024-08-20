package com.migscan.migscan.controller;

import com.migscan.migscan.dto.BarcodeTypeDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.migscan.migscan.service.BarcodeTypeService;

@RestController
@RequestMapping("/api/barcodeTypes")
public class BarcodeTypeController {

    private final BarcodeTypeService barcodeTypeService;

    // Constructor injection
    public BarcodeTypeController(BarcodeTypeService barcodeTypeService) {
        this.barcodeTypeService = barcodeTypeService;
    }

    @PostMapping
    public ResponseEntity<BarcodeTypeDto> createBarcodeType(@RequestBody BarcodeTypeDto barcodeTypeDto) {
        BarcodeTypeDto savedBarcodeType = barcodeTypeService.createBarcodeType(barcodeTypeDto);
        return new ResponseEntity<>(savedBarcodeType, HttpStatus.CREATED);
    }
}
