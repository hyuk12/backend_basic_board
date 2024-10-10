package com.board.basic.board.domain.web.board.entity;

import java.time.LocalDateTime;

import com.board.basic.board.domain.web.user.entity.User;
import com.board.basic.board.global.entity.BaseTimeEntity;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "board")
public class Board extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 게시판 제목
	@Column(name = "title", nullable = false)
	private String title;
	// 게시판 내용
	@Column(name = "content", nullable = false)
	private String content;
	// 게시판 작성자
	@ManyToOne
	@JoinColumn(name = "author_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
	private User author;
}
