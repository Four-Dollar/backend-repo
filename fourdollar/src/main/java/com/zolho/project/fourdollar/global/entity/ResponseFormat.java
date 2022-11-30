package com.zolho.project.fourdollar.global.entity;

import lombok.Getter;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.global.entity
 * @name : ResponseFormat
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Getter
public class ResponseFormat<T> {
    private final String code;

    private final String message;

    private T result;

    public ResponseFormat(ResponseStatus status){
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public ResponseFormat(ResponseStatus status, T result){
        this.code = status.getCode();
        this.message = status.getMessage();
        this.result = result;
    }
}
