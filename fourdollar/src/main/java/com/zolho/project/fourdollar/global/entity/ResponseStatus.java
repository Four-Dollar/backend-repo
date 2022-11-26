package com.zolho.project.fourdollar.global.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatus {
    // 파일(File) 응답상태
    // Head Name: F
    POST_FILE_SUCCESS("F000", "파일 업로드 성공"),
    DELETE_FILE_SUCCESS("F001", "파일 삭제 성공");

    private final String code;
    private final String message;
}
