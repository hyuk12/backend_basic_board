package com.board.basic.board.domain.web.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.facade.BoardFacade;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Tag(name="Board", description = "게시판 API")
@Slf4j
@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {
	private final BoardFacade boardFacade;
	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
	@PostMapping
	@Operation(summary = "게시판 등록")
	public ResponseEntity<?> saveBoard(@RequestBody BoardCreateReqDto req) {
		if (boardFacade.saveBoard(req) == 1) {
			return ResponseEntity.ok().body(new BoardResponseDto(HttpStatus.OK, "게시판 등록 성공"));
		} else {
			return ResponseEntity.badRequest().body(new BoardResponseDto(HttpStatus.BAD_REQUEST, "게시판 등록 실패"));
		}
	}
	// 게시판 수정

	// 게시판 삭제


}
