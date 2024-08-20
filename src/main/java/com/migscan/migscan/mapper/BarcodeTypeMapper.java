package com.migscan.migscan.mapper;

import com.migscan.migscan.dto.BarcodeTypeDto;
import com.migscan.migscan.entity.BarcodeType;

public class BarcodeTypeMapper {
    public static BarcodeTypeDto mapToBarcodeTypeDto(BarcodeType barcodeType) {
        return new BarcodeTypeDto(
                barcodeType.getId(),
                barcodeType.getBarcodeType()
        );
    }

    public static BarcodeType mapToBarcodeType(BarcodeTypeDto barcodeTypeDto) {
        return new BarcodeType(
                barcodeTypeDto.getId(),
                barcodeTypeDto.getBarcodeType()
        );
    }
}