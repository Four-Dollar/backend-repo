package com.zolho.project.fourdollar.domain.usedgoods.mapper;

import com.zolho.project.fourdollar.domain.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.response.UsedGoodsResponse;
import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoodsBid;
import com.zolho.project.fourdollar.global.entity.Mapper;
import lombok.RequiredArgsConstructor;


/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.mapper
 * @name : UsedGoodsMapper
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */

@Mapper
@RequiredArgsConstructor
public class UsedGoodsMapper {

    public UsedGoods toEntity(UsedGoodsRequest dto) {
        return UsedGoods.builder()
                .userId(dto.getUserId())
                .title(dto.getTitle())
                .description(dto.getDescription())
                .build();
    }

    public UsedGoodsResponse toDto(UsedGoods entity) {
        return UsedGoodsResponse.builder()
                .userId(entity.getUserId())
                .title(entity.getTitle())
                .description(entity.getDescription())
                .build();
    }

}
