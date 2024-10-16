package com.board.basic.board.domain.web.board.dto.req;

import com.board.basic.board.domain.web.board.entity.Board;
import com.board.basic.board.domain.web.user.entity.User;

public record BoardCreateReqDto(
	String title,
	String content,
	String author
) {
	public Board of () {
		return Board.builder()
			.title(title)
			.content(content)
			.author(author)
			.build();
	}
}
