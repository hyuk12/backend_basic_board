package com.board.basic.board.domain.web.board.dto.req;

import com.board.basic.board.domain.web.board.entity.Board;

import lombok.Builder;

@Builder
public record BoardCreateReqDto(
	String title,
	String content,
	String author
) {
	public Board toEntity() {
		return Board.builder()
			.title(this.title)
			.content(this.content)
			.author(this.author)
			.build();
	}
}
