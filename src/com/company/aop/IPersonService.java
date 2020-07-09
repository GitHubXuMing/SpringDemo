package com.company.aop;

import java.util.List;

import com.company.spring.Person;

public interface IPersonService {
	void save();
	void update();
	void delete();
	List<Person> findAll();
}
