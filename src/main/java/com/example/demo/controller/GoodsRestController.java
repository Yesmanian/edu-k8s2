package com.example.demo.controller;

import com.example.demo.dto.GoodsDto;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.demo.controller
 * fileName       : UserRestController
 * author         : doong2s
 * date           : 2025. 1. 12.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025. 1. 12.        doong2s       최초 생성
 */
@RestController
@RequestMapping("/api/v1/goods")
public class GoodsRestController {


    @Autowired
    private GoodsService userService;

    @GetMapping("/{goodsNo}")
    public ResponseEntity<GoodsDto> getGoodsByGoodsNo(@PathVariable String goodsNo) {
        GoodsDto goodsDto = userService.getUserByuserNo(goodsNo);
        return ResponseEntity.ok(goodsDto);
    }
}
