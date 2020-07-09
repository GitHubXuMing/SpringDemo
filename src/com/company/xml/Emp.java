package com.company.xml;

import java.math.BigDecimal;

public class Emp {
	private int empno;
	private String ename;
	private BigDecimal sal;
	private Integer deptno;
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public Emp(int empno, String ename, BigDecimal sal, Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
}
