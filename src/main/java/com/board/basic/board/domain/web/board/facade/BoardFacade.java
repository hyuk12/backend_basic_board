package com.board.basic.board.domain.web.board.facade;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.dto.req.BoardUpdateReqDto;
import com.board.basic.board.domain.web.board.dto.resp.BoardListRespDto;
import com.board.basic.board.domain.web.board.service.BoardCreateService;
import com.board.basic.board.domain.web.board.service.BoardDeleteService;
import com.board.basic.board.domain.web.board.service.BoardGetService;
import com.board.basic.board.domain.web.board.service.BoardUpdateService;

import lombok.RequiredArgsConstructor;

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

	public BoardListRespDto getBoardById(Long boardId) {
		return BoardListRespDto.of(boardGetService.getBoardById(boardId));
	}

	public void updateBoard(BoardUpdateReqDto req) {
		boardUpdateService.updateBoard(req);
	}

	public void deleteBoard(Long id) {
		boardDeleteService.deleteBoard(id);
	}
}
