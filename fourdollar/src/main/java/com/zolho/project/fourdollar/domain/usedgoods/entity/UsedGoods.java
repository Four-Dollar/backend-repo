package com.zolho.project.fourdollar.domain.usedgoods.entity;

import com.zolho.project.fourdollar.global.entity.BaseTime;
import lombok.*;

import javax.persistence.*;
import java.util.Date;


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
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsedGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // TODO : 추후에 수정 예정
    @Column(nullable = false)
    private int userId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Embedded
    private BaseTime baseTime;

    @Column(nullable = false)
    private Boolean isDeleted;

    @Builder
    public UsedGoods(int userId, String title, String description) {
        this.userId = userId;
        this.title = title;
        this.description = description;
    }

}
