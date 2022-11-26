package com.zolho.project.fourdollar.domain.file.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.dto.request
 * @name : FileRequest
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class FileRequest {
    private Long userGoodsId;
    private String fileUrl;
    private MultipartFile file;
}
