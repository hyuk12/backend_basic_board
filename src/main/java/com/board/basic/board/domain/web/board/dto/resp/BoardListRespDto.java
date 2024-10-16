package com.board.basic.board.domain.web.board.dto.resp;

import com.board.basic.board.domain.web.board.entity.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
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
			.author(board.getAuthor())
			.createdDate(board.getCreatedDate().toString())
			.updatedDate(board.getUpdatedDate().toString())
			.build();
	}
}
