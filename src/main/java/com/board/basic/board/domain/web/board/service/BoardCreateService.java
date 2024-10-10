package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.basic.board.domain.web.board.dto.req.BoardCreateReqDto;
import com.board.basic.board.domain.web.board.entity.repository.BoardRepository;
import com.board.basic.board.domain.web.user.entity.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardCreateService {
	private final BoardRepository boardRepository;
	private final UserRepository userRepository;
	// 게시판 목록 조회

	// 게시판 상세 조회

	// 게시판 등록
	public void saveBoard(BoardCreateReqDto req) {
		try {
			boardRepository.save(req.of(userRepository.findById(req.authorId()).orElse(null)));
		} catch (Exception e) {
			throw new IllegalArgumentException("게시판 등록에 실패하였습니다.");
		}
	}

	// 게시판 수정

	// 게시판 삭제
}
