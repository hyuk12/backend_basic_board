package com.board.basic.board.domain.web.board.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.dto.req.BoardUpdateReqDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardResponseDto;
import com.board.basic.board.domain.web.board.facade.BoardFacade;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Tag(name = "Board", description = "게시판 API")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/board")
public class BoardController {
	private final BoardFacade boardFacade;
	// 게시판 목록 조회
	@GetMapping("/list")
	public ResponseEntity<?> getAllBoards() {
		try {
			return ResponseEntity.ok().body(BoardResponseDto.ofSuccess("게시판 목록 조회에 성공하였습니다.", boardFacade.getAllBoards()));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(BoardResponseDto.ofFail("게시판 목록 조회에 실패하였습니다."));
		}
	}
	// 게시판 상세 조회
	@GetMapping("/{boardId}")
	public ResponseEntity<?> getBoardById(@PathVariable Long boardId) {
		try {
			return ResponseEntity.ok().body(BoardResponseDto.ofSuccess("게시판 상세 조회에 성공하였습니다.", boardFacade.getBoardById(boardId)));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(BoardResponseDto.ofFail("게시판 상세 조회에 실패하였습니다."));
		}
	}

	// 게시판 등록
	@PostMapping
	public ResponseEntity<?> saveBoard(@RequestBody BoardCreateReqDto req) {
		try {
			boardFacade.saveBoard(req);
			return ResponseEntity.ok().body(BoardResponseDto.ofSuccess("게시판 등록에 성공하였습니다."));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(BoardResponseDto.ofFail("게시판 등록에 실패하였습니다."));
		}
	}

	// 게시판 수정
	@PutMapping("/{id}")
	public ResponseEntity<?> updateBoard(@RequestBody BoardUpdateReqDto req, @PathVariable Long id) {
		try {
			boardFacade.updateBoard(req, id);
			return ResponseEntity.ok().body(BoardResponseDto.ofSuccess("게시판 수정에 성공하였습니다."));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(BoardResponseDto.ofFail("게시판 수정에 실패하였습니다."));
		}
	}

	// 게시판 삭제
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteBoard(@PathVariable Long id) {
		try {
			boardFacade.deleteBoard(id);
			return ResponseEntity.ok().body(BoardResponseDto.ofSuccess("게시판 삭제에 성공하였습니다."));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(BoardResponseDto.ofFail("게시판 삭제에 실패하였습니다."));
		}
	}
}
