package org.siemens.model;

public class User {

	private String name;
	private int age;
	private String dob;
	
	public User() {
		super();
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDob(){
		return dob;
	}
	
	public void setDob(){
		this.dob = dob;
	}
	
	public 
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
