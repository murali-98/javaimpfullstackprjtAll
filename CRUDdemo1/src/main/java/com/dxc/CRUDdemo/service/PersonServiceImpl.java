package com.dxc.CRUDdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.CRUDdemo.controller.dto.request.PersonDTO;
import com.dxc.CRUDdemo.dao.PersonDAO;
import com.dxc.CRUDdemo.entity.Person;

@Service
public class PersonServiceImpl implements PersonService{
  @Autowired
  private PersonDAO personDAO;
	@Override
	public boolean savePersonInDB(PersonDTO personDTO) {
		// TODO Auto-generated method stub
		Person person=initializePerson(personDTO);
		Person saved=personDAO.save(person);
		if(saved!=null)
			return true;
		return false;
	}
	private Person initializePerson(PersonDTO personDTO) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.setName(personDTO.getName());
		person.setMobile(personDTO.getMobile());
		person.setDob(personDTO.getDob());
		
		return person;
	}
	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personDAO.findAll();
	}
	@Override
	public Person getPersonBasedOnId(long id) {
		// TODO Auto-generated method stub
		//return personDAO.findById(id)//it will return optional
		Optional<Person> findById=personDAO.findById(id);
		if(findById.isPresent())
			return findById.get();
		return null;
	}
	@Override
	public boolean updatePerson(PersonDTO personDTO) {
		// TODO Auto-generated method stub
	long id=personDTO.getId();
	Optional<Person> findById=personDAO.findById(id);
	if(findById.isPresent()) {
		Person person=findById.get();
		person.setName(personDTO.getName());
		person.setMobile(personDTO.getMobile());
		person.setDob(personDTO.getDob());
		
		personDAO.save(person);
		return true;
	}
	
		return false;
	}
	@Override
	public void deletePersonInfo(long id) {
		// TODO Auto-generated method stub
		Optional<Person> findById= personDAO.findById(id);
		if(findById!=null) {
			Person person=findById.get();
			personDAO.deleteById(id);
		}
		
		
	}

}
