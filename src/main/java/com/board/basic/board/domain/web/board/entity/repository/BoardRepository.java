package com.board.basic.board.domain.web.board.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.basic.board.domain.web.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	void updateBoard(Long id, String title, String content);
}
