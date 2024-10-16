package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.basic.board.domain.web.board.dto.req.BoardUpdateReqDto;
import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.global.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardUpdateService {
	// private final BoardRepository boardRepository;
	private final BoardMapper boardMapper;

	// 게시판 수정
	public void updateBoard(BoardUpdateReqDto req, Long id) {
		Board board = req.of();
		board.setId(id);
		boardMapper.updateBoard(board);
		// boardRepository.updateBoard(req.id(), req.title(), req.content());
	}
}
