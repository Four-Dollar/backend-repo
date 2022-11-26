package com.zolho.project.fourdollar.domain.file.service;

import com.zolho.project.fourdollar.domain.file.dto.request.FileRequest;
import com.zolho.project.fourdollar.domain.file.dto.response.FileResponse;
import com.zolho.project.fourdollar.domain.file.entity.File;
import com.zolho.project.fourdollar.domain.file.mapper.FileMapper;
import com.zolho.project.fourdollar.domain.file.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.service
 * @name : FileService
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Service
@RequiredArgsConstructor
public class FileService {

    @Autowired
    FileRepository fileRepository;
    private final FileMapper fileMapper;

    // 파일 생성
    @Transactional
    public FileResponse create(FileRequest requestDto){
        //File file = fileMapper.mapToEntity(requestDto);
        File file = fileRepository.save(fileMapper.toEntity(requestDto));

        return fileMapper.toDto(file);
    }

    @Transactional
    public List<FileResponse> getAll(){
        return fileRepository.findAll()
                .stream()
                .map(fileMapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public FileResponse deleteById(Long id){
        File file = getEntity(id);
        boolean isPresent = fileRepository.findById(id).isPresent();
        if(!isPresent) {
        } else{
            fileRepository.deleteById(id);
        }
        //file.getBaseTime().delete();
        return fileMapper.toDto(file);
    }

    public File getEntity(Long id) {
        return fileRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}
