package com.zolho.project.fourdollar.domain.usedgoods.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.dto.respond
 * @name : UsedGoodsResponse
 * @create-date: 2022.11.23
 * @update-date : 2022.11.30
 * @update-author : 조현민, 김현진
 * @update-description : file, UsedGoods 합침
 */


@Setter
@Builder
@AllArgsConstructor
@ToString
@Getter
public class UsedGoodsResponse {
    private int user_id;
    private String title;
    private String description;
    private String pictures_id;
    private int bid;
    private LocalDateTime deadline;
    private LocalDateTime created_at;
    //private boolean isDeleted;
}
