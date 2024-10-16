package com.board.basic.board.domain.web.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.global.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class BoardGetService {
	// private final BoardRepository boardRepository;
	private final BoardMapper boardMapper;

	public List<Board> getAllBoards() {
		return boardMapper.selectBoardList();
	}

	public Board getBoardById(Long id) {
		return boardMapper.selectBoard(id);
		// return boardRepository.findById(boardId).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));
	}
}
