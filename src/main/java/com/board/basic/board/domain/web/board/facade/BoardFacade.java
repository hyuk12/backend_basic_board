package com.board.basic.board.domain.web.board.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.dto.req.BoardUpdateReqDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardListRespDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.service.BoardCreateService;
import com.board.basic.board.domain.web.board.service.BoardDeleteService;
import com.board.basic.board.domain.web.board.service.BoardGetService;
import com.board.basic.board.domain.web.board.service.BoardUpdateService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@RequiredArgsConstructor
public class BoardFacade {
	private final BoardCreateService boardCreateService;
	private final BoardGetService boardGetService;
	private final BoardUpdateService boardUpdateService;
	private final BoardDeleteService boardDeleteService;

	public void saveBoard(BoardCreateReqDto req) {
		boardCreateService.saveBoard(req);
	}

	public List<BoardListRespDto> getAllBoards() {
		return boardGetService.getAllBoards().stream().map(BoardListRespDto::of).toList();
	}

	public BoardListRespDto getBoardById(Long id) {
		return boardGetService.getBoardById(id).of();
	}

	public void updateBoard(BoardUpdateReqDto req, Long id) {
		boardUpdateService.updateBoard(req, id);
	}

	public void deleteBoard(Long id) {
		boardDeleteService.deleteBoard(id);
	}
}
