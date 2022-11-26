package com.zolho.project.fourdollar.domain.file.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.dto.response
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
    private Long userGoodsId;
    private String fileUrl;
    //private MultipartFile file;
    private LocalDateTime createAt;
}
