package com.example.demo.service;

import com.example.demo.dto.GoodsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.example.demo.service
 * fileName       : UserService
 * author         : doong2s
 * date           : 2025. 1. 12.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 1. 12.        doong2s       최초 생성
 */
@Service
public class GoodsService {

    String appRunType;

    public GoodsService(@Value("${app.run.type:local}") String appRunType) {
        this.appRunType = appRunType;
    }

    public GoodsDto getUserByuserNo(String goodsNo) {

        GoodsDto goodsDto = GoodsDto.builder()
                .goodsNo(goodsNo)
                .goodsName(appRunType + "-" + goodsNo)
                .build();
        return goodsDto;
    }
}
