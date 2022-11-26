package com.zolho.project.fourdollar.domain.usedgoods.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.dto.request
 * @name : UsedGoodsRequest
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UsedGoodsRequest {

    private int user_id;
    private String title;
    private String description;
    private String[] pictures;
    private int bid;
    private int deadline;
}