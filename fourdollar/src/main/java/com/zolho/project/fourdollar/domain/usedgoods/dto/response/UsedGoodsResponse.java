package com.zolho.project.fourdollar.domain.usedgoods.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

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

@Getter
@Builder
@AllArgsConstructor
public class UsedGoodsResponse {

    private int userId;
    private String title;
    private String description;
//    private String[] pictures;
    private int bid;
    private Date deadline;
}
