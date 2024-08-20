package com.migscan.migscan.service.impl;

import com.migscan.migscan.dto.BarcodeTypeDto;
import com.migscan.migscan.entity.BarcodeType;
import com.migscan.migscan.mapper.BarcodeTypeMapper;
import com.migscan.migscan.repository.BarcodeTypeRepository;
import com.migscan.migscan.service.BarcodeTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BarcodeTypeServiceImpl implements BarcodeTypeService {
    private BarcodeTypeRepository barcodeTypeRepository;

    @Override
    public BarcodeTypeDto createBarcodeType(BarcodeTypeDto barcodeTypeDto) {
        BarcodeType barcodeType = BarcodeTypeMapper.mapToBarcodeType(barcodeTypeDto);
        BarcodeType savedBarcodeType = barcodeTypeRepository.save(barcodeType);
        return BarcodeTypeMapper.mapToBarcodeTypeDto(savedBarcodeType);
    }

}
