package com.board.basic.board.domain.web.board.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.board.basic.board.domain.web.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	@Modifying
	@Query("update Board b set b.title = ?2, b.content = ?3 where b.id = ?1")
	int updateBoard(Long id, String title, String content);
}
