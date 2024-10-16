package com.board.basic.board.domain.web.board.dto.resp;

import org.springframework.http.HttpStatus;

public record BoardResponseDto(
	HttpStatus status,
	String message,
	Object data
) {
	public static BoardResponseDto of(HttpStatus status, String message, Object object) {
		return new BoardResponseDto(status, message, object);
	}

	public static BoardResponseDto of(HttpStatus status) {
		return new BoardResponseDto(status, null, null);
	}

	public static BoardResponseDto of(String message) {
		return new BoardResponseDto(null, message, null);
	}

	public static BoardResponseDto of() {
		return new BoardResponseDto(null, null, null);
	}

	public static BoardResponseDto ofSuccess() {
		return new BoardResponseDto(HttpStatus.OK, null, null);
	}

	public static BoardResponseDto ofFail() {
		return new BoardResponseDto(HttpStatus.BAD_REQUEST, null, null);
	}

	public static BoardResponseDto ofSuccess(String message) {
		return new BoardResponseDto(HttpStatus.OK, message, null);
	}
	public static BoardResponseDto ofSuccess(String message, Object object) {
		return new BoardResponseDto(HttpStatus.OK, message, object);
	}

	public static BoardResponseDto ofFail(String message) {
		return new BoardResponseDto(HttpStatus.BAD_REQUEST, message, null);
	}

}
