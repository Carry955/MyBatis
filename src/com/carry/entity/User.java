package com.carry.entity;

public class User {
	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + "]";
	}
	private String number;
	private String name;
	private int age;
	private String gender;
	private String address;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
