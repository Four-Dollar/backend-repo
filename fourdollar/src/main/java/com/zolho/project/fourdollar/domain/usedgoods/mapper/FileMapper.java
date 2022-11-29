package com.zolho.project.fourdollar.domain.usedgoods.mapper;

import com.zolho.project.fourdollar.domain.usedgoods.dto.request.FileRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.response.FileResponse;
import com.zolho.project.fourdollar.domain.usedgoods.entity.File;
import com.zolho.project.fourdollar.global.entity.Mapper;
import lombok.RequiredArgsConstructor;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.mapper
 * @name : FileMapper
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Mapper
@RequiredArgsConstructor
public class FileMapper {
    public File toEntity(FileRequest dto){
        return File.builder()
                //.userGoodsId(dto.getUserGoodsId())
                .fileUrl(dto.getFileUrl())
                .build();
    }

    public FileResponse toDto(File entity){
        return FileResponse.builder()
                .id(entity.getId())
                .fileUrl(entity.getFileUrl())
                .build();
    }
}
