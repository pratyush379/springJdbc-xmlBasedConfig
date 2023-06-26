package com.pratyush.spring_jdbc.Entity;

public class Student {
private int id;
private String name;
private String city;
private int phoneno;
public Student(int id, String name, String city, int phoneno) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.phoneno = phoneno;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", city=" + city + ", phoneno=" + phoneno + "]";
}
}
