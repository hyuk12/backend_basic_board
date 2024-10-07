package com.board.basic.board.domain.web.board.service;

import org.springframework.stereotype.Service;

import com.board.basic.board.domain.web.board.entity.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardGetService {
	private final BoardRepository boardRepository;
}
