package com.zolho.project.fourdollar.domain.usedgoods.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Member;

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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UsedGoods {

    @Id
    @GeneratedValue
    private int id;

    // TODO : 추후에 수정 예정
    @Column(nullable = false)
    @Getter
    private int user_id;

    @Setter
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    @Setter
    private Member menager;

}
