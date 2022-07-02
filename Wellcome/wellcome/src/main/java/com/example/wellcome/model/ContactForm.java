package com.example.wellcome.model;

import lombok.Data;

@Data
public class ContactForm {
    private Long id;
	private Long menu_id;
	private String name;
	private String email;
	private String gender;
	private String detail;
    private String menu_no;
}
