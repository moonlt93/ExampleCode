package com.zerock.domain;



import lombok.Data;

@Data
public class BoardVO {
	private Long bno;
	private String title;
	private String writer;
	private String content;

}
