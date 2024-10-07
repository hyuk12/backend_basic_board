package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.entity.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardCreateService {
	private final BoardRepository boardRepository;

	// 게시판 등록
	public Board saveBoard(Board board) {
		 return boardRepository.save(board);
	}

}
