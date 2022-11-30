package com.zolho.project.fourdollar.domain.usedgoods.entity;

import com.zolho.project.fourdollar.global.entity.BaseTime;
import lombok.*;

import javax.persistence.*;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.entity
 * @name : File
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Entity
@Getter
@Setter
@ToString
public class File extends BaseTime{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fileUrl;

    @Column(nullable = false)
    @Builder.Default
    private boolean isDeleted = Boolean.FALSE;

    // UsedGoods 외래키 연결
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userGoods_id")
    private UsedGoods usedGoods;

    @Builder
    public File(String fileUrl, UsedGoods usedGoods){
        this.fileUrl = fileUrl;
        this.usedGoods = usedGoods;
    }

    public File() {

    }
}
