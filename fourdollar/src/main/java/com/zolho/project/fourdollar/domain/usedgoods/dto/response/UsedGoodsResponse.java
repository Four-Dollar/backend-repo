package com.zolho.project.fourdollar.domain.usedgoods.dto.response;

import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.dto.respond
 * @name : UsedGoodsResponse
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */


@Setter
@Builder
@AllArgsConstructor
@ToString
@Getter
public class UsedGoodsResponse {

    private int userId;
    private String title;
    private String description;
    private String pictures_id; //타입이 맞나?
    private int bid;
    private boolean isDeleted;
    private int deadline;



}
