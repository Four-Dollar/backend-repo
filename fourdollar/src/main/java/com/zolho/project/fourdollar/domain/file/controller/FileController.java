package com.zolho.project.fourdollar.domain.file.controller;

import com.zolho.project.fourdollar.domain.file.dto.request.FileRequest;
import com.zolho.project.fourdollar.domain.file.dto.response.FileResponse;
import com.zolho.project.fourdollar.domain.file.entity.File;
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

import java.io.IOException;
import java.util.List;

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
    public ResponseEntity<ResponseFormat<FileResponse>> create(FileRequest dto) throws IOException {
        String url = s3Service.uploadFile(dto.getFile(), "used_files/");
        dto.setFileUrl(url);
        FileResponse saveFile = fileService.create(dto);
        ResponseFormat<FileResponse> responseBody = new ResponseFormat<>(ResponseStatus.POST_FILE_SUCCESS, saveFile);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }

    // 파일 삭제
    @DeleteMapping("{id}")
    public ResponseEntity<ResponseFormat<FileResponse>> delete(@PathVariable Long id){
        FileResponse deleteFile = fileService.deleteById(id);
        ResponseFormat<FileResponse> responseFormat = new ResponseFormat<>(ResponseStatus.DELETE_FILE_SUCCESS, deleteFile);

        return ResponseEntity.ok(responseFormat);
    }

    // 파일 가져오기, 아마 외래키로 값 가져와야할 것 같음
    @GetMapping
    public ResponseEntity<ResponseFormat<List<FileResponse>>> getAll(){
        List<FileResponse> files = fileService.getAll();
        ResponseFormat<List<FileResponse>> responseFormat = new ResponseFormat<>(ResponseStatus.GET_FILE_SUCCESS, files);

        return ResponseEntity.ok(responseFormat);
    }
}
