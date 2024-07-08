package com.todo.application.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ToDo")
public class ToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@NonNull
	private Long id;

	@Column
	private String title;
	@Column
	@NonNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	@Column
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", title=" + title + ", date=" + date + ", status=" + status + "]";
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ToDo(Long id, String title, Date date, String status) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.status = status;
	}

	public ToDo() {
		super();
	}

}
