package com.board.basic.board.domain.web.board.dto.req;

public record BoardUpdateReqDto(
	Long id,
	String title,
	String content
) {
}
