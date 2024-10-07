package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;

import com.board.basic.board.domain.web.board.entity.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardUpdateService {
	private final BoardRepository boardRepository;

	// 게시판 수정
	public int updateBoard(Long id, String title, String content) {
		return boardRepository.updateBoard(id, title, content);
	}
}
