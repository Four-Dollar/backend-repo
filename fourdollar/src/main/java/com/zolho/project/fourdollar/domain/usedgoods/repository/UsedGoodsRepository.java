package com.zolho.project.fourdollar.domain.usedgoods.repository;

import com.zolho.project.fourdollar.domain.usedgoods.entity.UsedGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsedGoodsRepository extends JpaRepository<UsedGoods, Integer> {
}
