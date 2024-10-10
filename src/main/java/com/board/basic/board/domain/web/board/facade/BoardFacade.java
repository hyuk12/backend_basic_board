package com.board.basic.board.domain.web.board.facade;

import org.springframework.stereotype.Component;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.service.BoardCreateService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BoardFacade {
	private final BoardCreateService boardCreateService;

	public void saveBoard(BoardCreateReqDto req) {
		boardCreateService.saveBoard(req);
	}
}
