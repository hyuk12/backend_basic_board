package com.board.basic.board.domain.web.board.entity;

import com.board.basic.board.domain.web.board.dto.resp.BoardListRespDto;
import com.board.basic.board.global.entity.BaseTimeEntity;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
public class Board extends BaseTimeEntity {


	private Long id;

	// 게시판 제목

	private String title;
	// 게시판 내용

	private String content;
	// 게시판 작성자

	private String author;

	public BoardListRespDto of() {
		return new BoardListRespDto(id, title, content, author, getCreatedDate().toString(),
			getUpdatedDate().toString());
	}
}
