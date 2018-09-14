package com.itheima.springmvc.test;

public class Info {
	private int age;
	
	private String name;

	public Info(int i, String string) {
		// TODO Auto-generated constructor stub
		age = i;
		name = string;
	}

	@Override
	public String toString() {
		return "Info [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
