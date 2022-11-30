package com.zolho.project.fourdollar.domain.usedgoods.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;
import java.util.List;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.dto.request
 * @name : UsedGoodsRequest
 * @create-date: 2022.11.23
 * @update-date : 2022.11.30
 * @update-author : 조현민, 김현진
 * @update-description :
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsedGoodsRequest {
    private int user_id;
    private String title;
    private String description;
    private List pictures;
    private int bid;
    private int deadline;
}
