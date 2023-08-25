package com.rt.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentdata")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name ;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "mobile")
    private String mobile;
    
    @Column(name = "adress")
    private String adress;
    
    public Student(){};
    
	public Student(int id, String name, String surname, String branch, String mobile, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.branch = branch;
		this.mobile = mobile;
		this.adress = adress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
    
}
