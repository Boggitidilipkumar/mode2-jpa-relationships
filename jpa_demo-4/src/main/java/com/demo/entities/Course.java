package com.demo.entities;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course_table")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String name;
	private String duration;
	@JoinTable(name="stud_course_table",joinColumns=@JoinColumn(name="cid_fk"),
			inverseJoinColumns=@JoinColumn(name="id_fk"))
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Student> student = new ArrayList<>();

	public int getId() {
		return cid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	public Course() {}

	public Course(String name, String duration) {
		this.name = name;
		this.duration = duration;
	}
	
	
	
	
	

}