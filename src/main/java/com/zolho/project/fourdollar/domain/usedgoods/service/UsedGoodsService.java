package com.zolho.project.fourdollar.domain.usedgoods.service;

import com.zolho.project.fourdollar.domain.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.response.UsedGoodsResponse;
import com.zolho.project.fourdollar.domain.usedgoods.entity.File;
import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import com.zolho.project.fourdollar.domain.usedgoods.mapper.UsedGoodsMapper;
import com.zolho.project.fourdollar.domain.usedgoods.repository.FileRepository;
import com.zolho.project.fourdollar.domain.usedgoods.repository.UsedGoodsRepository;
import com.zolho.project.fourdollar.global.file.service.S3Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.service
 * @name : UsedGoodsService
 * @create-date: 2022.11.23
 * @update-date : 2022.11.30
 * @update-author : 조현민, 김현진
 * @update-description :
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class UsedGoodsService {
    @Autowired
    S3Service s3Service;

    @Autowired
    UsedGoodsRepository usedGoodsRepository;

    @Autowired
    UsedGoodsMapper usedGoodsMapper;

    @Autowired
    FileRepository fileRepository;

    // 게시글 작성
    @Transactional
    public UsedGoodsResponse create(UsedGoodsRequest usedRequestDto, List<String> urls, UsedGoods usedGoods) {
        postBlankCheck(urls);
        UsedGoods saveUsedGoods = usedGoodsMapper.toEntity(usedRequestDto);
        usedGoodsRepository.save(saveUsedGoods);

        List<String> urlsList = new ArrayList<>();
        for (String fileUrl : urls) {
            File file = new File(fileUrl, saveUsedGoods);
            fileRepository.save(file);
            urlsList.add(file.getFileUrl());
        }
        return usedGoodsMapper.toDto(usedGoods, urlsList);
    }

    private void postBlankCheck(List<String> urls) {
        if (urls == null || urls.isEmpty()) { //.isEmpty()도 되는지 확인
            log.warn("없음");
        }
    }
}
