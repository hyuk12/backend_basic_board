package com.board.basic.board.domain.web.board.facade;

import org.springframework.stereotype.Component;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.dto.req.BoardUpdateReqDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.service.BoardCreateService;
import com.board.basic.board.domain.web.board.service.BoardUpdateService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BoardFacade {
	private final BoardCreateService boardCreateService;
	private final BoardUpdateService boardUpdateService;
	private final BoardGetService boardGetService;
	public int saveBoard(BoardCreateReqDto req) {
		Board board = boardCreateService.saveBoard(req.toEntity());
		if (board != null) {
			return 1;
		}
		return 0;
	}

	public int updateBoard(BoardUpdateReqDto req) {

		return 0;
	}
}
