package com.company.spring;

public class Person {
	private int pid;
	private String pname;
	private Phone phone;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", phone=" + phone + "]";
	}
	public Person(int pid, String pname, Phone phone) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.phone = phone;
	}
	
		
}
