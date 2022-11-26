package com.zolho.project.fourdollar.domain.file.entity;

import com.zolho.project.fourdollar.global.entity.BaseTime;
import lombok.*;

import javax.persistence.*;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.entity
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
public class File {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 외래키로 변경
    @Column(nullable = false)
    @Setter
    private Long userGoodsId;

    @Column(nullable = false)
    @Setter
    private String fileUrl;

    @Embedded
    private BaseTime baseTime;

    @Column(nullable = false)
    @Builder.Default
    private boolean isDeleted = Boolean.FALSE;

    @Builder
    public File(String fileUrl, Long userGoodsId){
        this.fileUrl = fileUrl;
        this.userGoodsId = userGoodsId;
    }

    public File() {
    }
}
