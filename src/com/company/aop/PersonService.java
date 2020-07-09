package com.company.aop;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.spring.Person;

@Service
public class PersonService implements IPersonService {

	@Override
	public void save() {
		System.out.println("personService save");
	}

	@Override
	public void update() {
		System.out.println("personService update");		
	}

	@Override
	public void delete() {
		System.out.println("personService delete");		
	}

	@Override
	public List<Person> findAll() {
		System.out.println("personService findAll");		
		return null;
	}

}
