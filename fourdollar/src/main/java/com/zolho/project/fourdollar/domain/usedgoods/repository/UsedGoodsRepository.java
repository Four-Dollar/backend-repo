package com.zolho.project.fourdollar.domain.usedgoods.repository;

import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.domain.usedgoods.repository
 * @name : UsedGoodsRepository
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */

@Repository
public interface UsedGoodsRepository extends JpaRepository<UsedGoods, Integer> {
}
