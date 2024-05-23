package com.dxc.CRUDdemo.service;

import java.util.List;

import com.dxc.CRUDdemo.controller.dto.request.PersonDTO;
import com.dxc.CRUDdemo.entity.Person;

public interface PersonService {

	//PersonDTO savePersonInDB(PersonDTO personDTO);
	//savePersonInDB(PersonDTO personDTO);
	boolean savePersonInDB(PersonDTO personDTO);

	List<Person> getAllPersons();

	Person getPersonBasedOnId(long id);

	boolean updatePerson(PersonDTO personDTO);

	void deletePersonInfo(long id);

	
}
