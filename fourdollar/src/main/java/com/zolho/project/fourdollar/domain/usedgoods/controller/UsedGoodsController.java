package com.zolho.project.fourdollar.domain.usedgoods.controller;

import com.zolho.project.fourdollar.domain.usedgoods.service.UsedGoodsService;
import com.zolho.project.fourdollar.domain.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.domain.usedgoods.dto.respond.BoardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author : 조현민
 * @version : 1.0.0
 * @package : com.zolho.project.fourdollar.usedgoods.controller
 * @name : UsedGoodsController
 * @create-date: 2022.11.23
 * @update-date : 2022.11.26
 * @update-author : 조현민
 * @update-description :
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/used-goods")
public class UsedGoodsController {

    private final UsedGoodsService usedGoodsService;

    @PostMapping
    public ResponseEntity<ResponseFormat<BoardResponse>> create(@ResponseBody UsedGoodsRequest dto) {
        // 제네릭, 컬렉션
        BoardResponse savedBoard = usedGoodsService.create(dto);
        ResponseFormat<BoardResponse> responseFormat = new ResponseFormat<>(ResponseStatus.POST_BOARD_SUCCESS, savedBoard);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseFormat);
    }
}
