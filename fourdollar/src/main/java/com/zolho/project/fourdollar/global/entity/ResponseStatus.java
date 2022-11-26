package com.zolho.project.fourdollar.global.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.global.entity
 * @name : ResponseStatus
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */


@Getter
@AllArgsConstructor
public enum ResponseStatus {
    // 파일(File) 응답상태
    // Head Name: F
    POST_FILE_SUCCESS("F000", "파일 업로드 성공"),
    DELETE_FILE_SUCCESS("F001", "파일 삭제 성공"),
    GET_FILE_SUCCESS("F002", "파일 가져오기 성공"),

    POST_USEDGOODS_SUCCESS("UG000", "상품 업로드 성공"),

    DELETE_USEDGOODS_SUCCESS("UG001", "상품 삭제 성공"),

    GET_USEDGOODS_SUCCESS("UG002", "상품 가져오기 성공");

    private final String code;
    private final String message;
}
