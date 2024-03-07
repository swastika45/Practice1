package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="STUDENT_DTLS")
public class StudentEntity {
@Id
	private Integer sid;
	private String name;
	private String gender;
	private String email;
	private String course;
}
