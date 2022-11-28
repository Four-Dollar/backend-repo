package com.zolho.project.fourdollar.domain.usedgoods.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

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

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UsedGoodsRequest {
    @JsonProperty
    private int userId;
    @JsonProperty
    private String title;
    @JsonProperty
    private String description;
//    private String[] pictures;
//    private int bid;
 //   private Date deadline;
}
