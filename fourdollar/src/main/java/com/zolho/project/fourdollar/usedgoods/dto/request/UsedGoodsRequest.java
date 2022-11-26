package com.zolho.project.fourdollar.usedgoods.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
