package com.board.basic.board.global.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.basic.board.domain.web.board.entity.Board;

@Mapper
public interface BoardMapper {
	void insertBoard(Board board);
	void updateBoard(Board board);
	void deleteBoard(Long id);
	List<Board> selectBoardList();
	Board selectBoard(Long id);
}
