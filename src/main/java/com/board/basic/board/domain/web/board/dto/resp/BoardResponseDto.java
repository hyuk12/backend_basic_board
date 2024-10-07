package com.board.basic.board.domain.web.board.dto.resp;

import org.springframework.http.HttpStatus;

public record BoardResponseDto(
	HttpStatus status,
	String message
) {
}
