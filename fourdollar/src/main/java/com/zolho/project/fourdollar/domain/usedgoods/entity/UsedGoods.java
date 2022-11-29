package com.zolho.project.fourdollar.domain.usedgoods.entity;

import com.zolho.project.fourdollar.global.entity.BaseTime;
import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.entity
 * @name : UsedGoods
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */

@Entity
@Data
@NoArgsConstructor
@ToString
public class UsedGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // TODO : 추후에 수정 예정
    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer bid;

    @Embedded
    private BaseTime baseTime;

    @Column
    private Boolean isDeleted;

    @Column
    private int deadline;

    @Builder
    public UsedGoods(Integer userId, String title, String description, Integer bid, int deadline) {
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.bid = bid;
        this.deadline = deadline;
    }

}


