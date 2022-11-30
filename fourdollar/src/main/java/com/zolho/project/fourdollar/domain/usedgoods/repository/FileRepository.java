package com.zolho.project.fourdollar.domain.usedgoods.repository;

import com.zolho.project.fourdollar.domain.usedgoods.entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE file SET is_deleted = true WHERE id = CAST(:id as INTEGER)", nativeQuery = true)
    void deleteById(@Param("id") int id);
}
