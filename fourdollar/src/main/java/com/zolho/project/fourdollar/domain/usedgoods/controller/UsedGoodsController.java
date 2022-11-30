package com.zolho.project.fourdollar.domain.usedgoods.controller;

import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import com.zolho.project.fourdollar.domain.usedgoods.service.UsedGoodsService;
import com.zolho.project.fourdollar.domain.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.response.UsedGoodsResponse;
import com.zolho.project.fourdollar.global.entity.ResponseFormat;
import com.zolho.project.fourdollar.global.entity.ResponseStatus;
import com.zolho.project.fourdollar.global.file.service.S3Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.controller
 * @name : UsedGoodsController
 * @create-date: 2022.11.23
 * @update-date : 2022.11.30
 * @update-author : 조현민, 김현진
 * @update-description : file, UsedGoods 합침
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/used-goods")
@Slf4j
@CrossOrigin(originPatterns = "http://localhost:3000")
public class UsedGoodsController {
    @Autowired
    S3Service s3Service;
    @Autowired
    UsedGoodsService usedGoodsService;

    @PostMapping
    public ResponseEntity<ResponseFormat<UsedGoodsResponse>> createUsedGoods(UsedGoodsRequest usedDto, @RequestPart("pictures") List<MultipartFile> multipartFiles, UsedGoods usedGoods){
        if (multipartFiles == null){
            log.warn("없음");
        }
        List<String> urls = s3Service.uploadFile(multipartFiles);
        UsedGoodsResponse savedUsedGoods = usedGoodsService.create(usedDto, urls, usedGoods);
        ResponseFormat<UsedGoodsResponse> responseFormat = new ResponseFormat<>(ResponseStatus.POST_USEDGOODS_SUCCESS, savedUsedGoods);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseFormat);
    }
}
