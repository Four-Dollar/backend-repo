package com.zolho.project.fourdollar.domain.usedgoods.mapper;

import com.zolho.project.fourdollar.domain.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.response.UsedGoodsResponse;
import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import com.zolho.project.fourdollar.global.entity.Mapper;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.mapper
 * @name : UsedGoodsMapper
 * @create-date: 2022.11.23
 * @update-date : 2022.11.30
 * @update-author : 조현민, 김현진
 * @update-description :
 */

@Mapper
@RequiredArgsConstructor
public class UsedGoodsMapper {
    public UsedGoods toEntity(UsedGoodsRequest dto) {
        return UsedGoods.builder()
                .user_id(dto.getUser_id())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .bid(dto.getBid())
                .deadline(dto.getDeadline())
                .build();
    }

    public UsedGoodsResponse toDto(UsedGoods UsedGoodsEntity, List<String> urlsList) {
        return UsedGoodsResponse.builder()
                .user_id(UsedGoodsEntity.getUser_id())
                .title(UsedGoodsEntity.getTitle())
                .description(UsedGoodsEntity.getDescription())
                .pictures_id(urlsList.toString())
                .bid(UsedGoodsEntity.getBid())
                .deadline(LocalDateTime.now().plusDays(UsedGoodsEntity.getDeadline()))
                .created_at(LocalDateTime.now())
                .build();
    }
}
