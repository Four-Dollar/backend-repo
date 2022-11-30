package com.zolho.project.fourdollar.global.entity;


import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.global.entity
 * @name : Mapper
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Mapper {
}
