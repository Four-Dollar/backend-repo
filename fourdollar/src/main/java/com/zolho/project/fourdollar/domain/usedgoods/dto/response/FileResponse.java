package com.zolho.project.fourdollar.domain.usedgoods.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.dto.response
 * @name : FileRequest
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Getter
@Builder
@AllArgsConstructor
@Setter
public class FileResponse {
    private Long id;
    private String fileUrl;
    private LocalDateTime createAt;
}
