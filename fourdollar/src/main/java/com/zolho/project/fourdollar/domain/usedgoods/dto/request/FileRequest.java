package com.zolho.project.fourdollar.domain.usedgoods.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.dto.request
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
    private String fileUrl;
    private MultipartFile file;
}
