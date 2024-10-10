package com.board.basic.board.domain.web.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.board.entity.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class BoardGetService {
	private final BoardRepository boardRepository;

	public List<Board> getAllBoards() {
		return boardRepository.findAll();
	}

	public Board getBoardById(Long boardId) {
		return boardRepository.findById(boardId).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다."));
	}
}
