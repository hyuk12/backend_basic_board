package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.global.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardCreateService {
	// private final BoardRepository boardRepository;
	// private final UserRepository userRepository;
	private final BoardMapper boardMapper;
	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
	public void saveBoard(BoardCreateReqDto req) {
		try {
			boardMapper.insertBoard(req.of());
		} catch (Exception e) {
			throw new IllegalArgumentException("게시판 등록에 실패하였습니다.");
		}
	}

	// 게시판 수정

	// 게시판 삭제
}
