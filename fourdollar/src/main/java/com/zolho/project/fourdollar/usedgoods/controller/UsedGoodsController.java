package com.zolho.project.fourdollar.usedgoods.controller;

import com.zolho.project.fourdollar.usedgoods.dto.request.UsedGoodsRequest;
import com.zolho.project.fourdollar.usedgoods.dto.respond.BoardResponse;
import com.zolho.project.fourdollar.usedgoods.service.UsedGoodsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
