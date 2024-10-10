package com.board.basic.board.domain.web.board.dto.resp;

import org.springframework.http.HttpStatus;

public record BoardResponseDto(
	HttpStatus status,
	String message
) {
	public static BoardResponseDto of(HttpStatus status, String message) {
		return new BoardResponseDto(status, message);
	}

	public static BoardResponseDto of(HttpStatus status) {
		return new BoardResponseDto(status, null);
	}

	public static BoardResponseDto of(String message) {
		return new BoardResponseDto(null, message);
	}

	public static BoardResponseDto of() {
		return new BoardResponseDto(null, null);
	}

	public static BoardResponseDto ofSuccess() {
		return new BoardResponseDto(HttpStatus.OK, null);
	}

	public static BoardResponseDto ofFail() {
		return new BoardResponseDto(HttpStatus.BAD_REQUEST, null);
	}

	public static BoardResponseDto ofSuccess(String message) {
		return new BoardResponseDto(HttpStatus.OK, message);
	}

	public static BoardResponseDto ofFail(String message) {
		return new BoardResponseDto(HttpStatus.BAD_REQUEST, message);
	}

}
