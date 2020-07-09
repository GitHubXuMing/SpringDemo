package com.company.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;

import com.company.xml.Emp;

public class RefDemo {
	public static void main(String[] args) throws Exception {
		//1-假设从xml文件中，读取了如下的一个字符串
		String className = "com.company.xml.Emp";
		//2-使用这个字符串，实现创建对象，为属性赋值，执行方法，并且使用对象
		Class clazz = Class.forName(className);
		//获取构造函数
//		Constructor[] cons =  clazz.getDeclaredConstructors();
//		for(Constructor con:cons) {
//			System.out.println(con);
//		}
		//3-获取属性
//		Field[] fields = clazz.getDeclaredFields();
//		for(Field field:fields) {
//			System.out.println(field.getType()+"**"+field.getName());
//		}
		//4-获取方法
//		Method[] methods = clazz.getDeclaredMethods();
//		for(Method method:methods) {
//			System.out.println(method);
//		}
		//5-执行指定的方法(对象+方法名+参数)
		
		Field field = clazz.getDeclaredField("ename");
		String setterName = "set"+field.getName().substring(0, 1).toUpperCase()+field.getName().substring(1);
		String getterName = "get"+field.getName().substring(0, 1).toUpperCase()+field.getName().substring(1);
		
		String ename = "SCOTT";
		Method setter = clazz.getDeclaredMethod(setterName,field.getType());
		Object obj = clazz.newInstance();
		setter.invoke(obj, ename);
		Method getter = clazz.getDeclaredMethod(getterName);
		System.out.println(getter.invoke(obj));
		//6-对属性赋值
		Field sal = clazz.getDeclaredField("sal");
		sal.setAccessible(true);
		sal.set(obj, new BigDecimal("6.8"));
		Emp emp = (Emp)obj;
		System.out.println(emp.getSal());
	}
}	
