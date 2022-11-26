package com.zolho.project.fourdollar.usedgoods.dto.respond;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
public class BoardResponse {

    private int user_id;
    private String title;
    private String description;
    private String[] pictures;
    private int bid;
    private int deadline;
    private Date created_at;
}
