package com.zolho.project.fourdollar.domain.usedgoods.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.Member;

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
