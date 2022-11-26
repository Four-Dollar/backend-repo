package com.zolho.project.fourdollar.domain.usedgoods.service;

import com.zolho.project.fourdollar.domain.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.response.UsedGoodsResponse;
import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import com.zolho.project.fourdollar.domain.usedgoods.mapper.UsedGoodsMapper;
import com.zolho.project.fourdollar.domain.usedgoods.repository.UsedGoodsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.service
 * @name : UsedGoodsService
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */

@Service
@RequiredArgsConstructor
public class UsedGoodsService {

    @Autowired
    UsedGoodsRepository usedGoodsRepository;

    private final UsedGoodsMapper usedGoodsMapper;

    // 게시물 등록
    @Transactional
    public UsedGoodsResponse create(UsedGoodsRequest requestDto) {
        UsedGoods usedGoods = usedGoodsRepository.save(usedGoodsMapper.toEntity(requestDto));

        return usedGoodsMapper.toDto(usedGoods);
    }


}
