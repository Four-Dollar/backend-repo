package com.zolho.project.fourdollar.domain.file.repository;

import com.zolho.project.fourdollar.domain.file.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : 김현진
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.file.repository
 * @name : FileRepository
 * @create-date: 2022.11.26
 * @update-date :
 * @update-author : 000
 * @update-description :
 */

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
