package com.board.basic.board.domain.web.board.dto.resp;

import com.board.basic.board.domain.web.board.entity.Board;

import lombok.Builder;

@Builder
public record BoardListRespDto(
	Long id,
	String title,
	String content,
	String author,
	String createdDate,
	String updatedDate
) {
	public static BoardListRespDto of(Board board) {
		return BoardListRespDto.builder()
			.id(board.getId())
			.title(board.getTitle())
			.content(board.getContent())
			.author(board.getAuthor() == null ? "": board.getAuthor().getName())
			.createdDate(board.getCreatedDate().toString())
			.updatedDate(board.getUpdatedDate().toString())
			.build();
	}
}
