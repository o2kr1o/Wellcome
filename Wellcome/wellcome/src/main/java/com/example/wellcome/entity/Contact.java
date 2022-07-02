package com.example.wellcome.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="contact")
public class Contact {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="menu_id")
	private Long menu_id;

    @Column(name="name")
	private String name;

    @Column(name="email")
	private String email;

    @Column(name="gender")
	private String gender;

    @Column(name="detail")
	private String detail;

	@Column(name="creation_time")
	private Date creation_time;
}
