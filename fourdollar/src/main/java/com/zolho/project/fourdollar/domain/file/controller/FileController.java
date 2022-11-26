package com.zolho.project.fourdollar.domain.file.controller;

import com.zolho.project.fourdollar.domain.file.dto.request.FileRequest;
import com.zolho.project.fourdollar.domain.file.dto.response.FileResponse;
import com.zolho.project.fourdollar.domain.file.repository.FileRepository;
import com.zolho.project.fourdollar.domain.file.service.FileService;
import com.zolho.project.fourdollar.global.entity.ResponseFormat;
import com.zolho.project.fourdollar.global.entity.ResponseStatus;
import com.zolho.project.fourdollar.global.file.servie.S3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.controller
 * @name : FileController
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@RestController
@RequestMapping("api/v1/file")
@RequiredArgsConstructor
public class FileController {
    private final S3Service s3Service;

    @Autowired
    FileService fileService;

    @Autowired
    FileRepository fileRepository;


    // 파일 생성
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ResponseFormat<FileResponse>> create(FileRequest dto){
        String url = s3Service.uploadFile(dto.getFile(), "used_files/");
        dto.setUrl(url);
        FileResponse result = fileService.create(dto);
        ResponseFormat<FileResponse> responseBody = new ResponseFormat<>(ResponseStatus.POST_FILE_SUCCESS,result);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }

    // 파일 삭제
    @DeleteMapping("{id}")
    public ResponseEntity<ResponseFormat<FileResponse>> delete(@PathVariable Long id){

    }
}
