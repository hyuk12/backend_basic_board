package com.board.basic.board.domain.web.board.dto.req;

public record BoardUpdateReqDto(
	String title,
	String content,
	String author
) {
}
