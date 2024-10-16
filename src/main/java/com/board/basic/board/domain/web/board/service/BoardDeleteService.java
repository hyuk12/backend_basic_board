package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.basic.board.global.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardDeleteService {
	// private final BoardRepository boardRepository;
	private final BoardMapper boardMapper;

	// 게시판 삭제
	public void deleteBoard(Long id) {
		boardMapper.deleteBoard(id);
	}
}
