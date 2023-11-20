package com.systex.msg.book.iface.rest.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

/**
 * Resource class for the Command API
 */
@Getter
@Setter
public class UpdateBookResource {

	private String bookId;

	@NotBlank
	private String name;
	@NotBlank
	private String author;
	@NotBlank
	private String isbn;
	@NotBlank
	private String label;

	public UpdateBookResource(String name, String author, String isbn, String label) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.label = label;
	}
}
