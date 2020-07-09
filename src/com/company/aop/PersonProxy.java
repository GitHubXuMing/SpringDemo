package com.company.aop;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.company.spring.Person;

@Component
public class PersonProxy implements IPersonService {
	@Autowired
	private IPersonService personService;
	
	private void before() {
		System.out.println("校验");
		System.out.println("前置日志");
		System.out.println("启动事务");
	}
	private void after() {
		System.out.println("校验");
		System.out.println("后置日志");
		System.out.println("事务提交或回滚");
	}
	

	@Override
	public void save() {
		before();
		personService.save();
		after();
		
	}

	@Override
	public void update() {
		before();
		personService.update();
		after();
		
	}

	@Override
	public void delete() {
		before();
		personService.delete();
		after();
		
	}

	@Override
	public List<Person> findAll() {
		before();
		List<Person> result = personService.findAll();
		after();
		return result;
	}
	
}
