package com.zolho.project.fourdollar.global.entity;

import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.global.entity
 * @name : BaseTime
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Getter
@Embeddable
@EntityListeners(AuditingEntityListener.class)
@ToString
public class BaseTime {
    @CreatedDate
    private LocalDateTime createAt;

    @LastModifiedDate
    private LocalDateTime updateAt;

    @PrePersist
    public void onPrePersist(){
        this.createAt = LocalDateTime.now();
        this.updateAt = this.updateAt;
    }

    @PreUpdate
    public void onPreUpdate() {
        this.updateAt = LocalDateTime.now();
    }

    //private LocalDateTime deleteAt;

//    public void delete() {
//        deleteAt = LocalDateTime.now();
//    }
}
