package com.example.wellcome.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="menu")
public class Menu {
	@Id
	@Column(name="menu_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long menu_id;

	@Column(name="menu_no")
	private String menu_no;
}
