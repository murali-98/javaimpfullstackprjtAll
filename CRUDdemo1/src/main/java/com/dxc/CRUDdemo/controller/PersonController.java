package com.dxc.CRUDdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.CRUDdemo.controller.dto.request.PersonDTO;
import com.dxc.CRUDdemo.controller.dto.response.CommonResponse;
import com.dxc.CRUDdemo.entity.Person;
import com.dxc.CRUDdemo.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	public PersonService personService;
	
	@PostMapping("/add")
	public ResponseEntity<CommonResponse> addPerson(@RequestBody PersonDTO personDTO){
	    if(personService.savePersonInDB(personDTO))
		return ResponseEntity.status(HttpStatus.OK).body(new CommonResponse("200","Person details has been saved successfully")) ;
		
		
	    return ResponseEntity.status(HttpStatus.OK).body(new CommonResponse("200","Unable to save Person details")) ;
		
	    /*post:http://localhost:9898/persons/add
	    i/p:
	    { 
	        "id":3,
	        "name":"Rajesh",
	        "mobile":"9834489894",
	         "dob":"20-8-2000"
	        }
	    o/P:
	    {
	        "code": "200",
	        "message": "Person details has been saved successfully"
	    }
	    */
	}
	
	@GetMapping("/getAll")
	public List<Person> fetchAllPersons(){
		return personService.getAllPersons();
		
		//get:http://localhost:9898/persons/getAll
	}
	@GetMapping("/getById")
	public Person fetchPersonDetails(@RequestParam(name="id") long id) {
		return personService.getPersonBasedOnId(id);
		/*get:http://localhost:9898/persons/getById?id=2
			i/p:
			o/p:{
             		"id": 2,
    				"name": "Ganesh",
    				"mobile": "9887665465",
    				"dob": "10-06-1998"
				}
			
			*/
		}
	@PutMapping("/update")
	public ResponseEntity<CommonResponse> updatePersonDetails(@RequestBody PersonDTO personDTO){
		 if(personService.updatePerson(personDTO))
				return ResponseEntity.status(HttpStatus.OK).body(new CommonResponse("200","Person details has been updated successfully")) ;
				
				return ResponseEntity.status(HttpStatus.OK).body(new CommonResponse("200","Unable to update Person details")) ;
		//		put:http://localhost:9898/persons/update
			//	{ 
			//		    "id":3,
			//		    "name":"Rame",
			//		    "mobile":"98",
			//		     "dob":"2-8-95"
			//	}	
		
	}
	@DeleteMapping("/deleteById")
	public void deletePerson(@RequestParam(name="id") long id) {
		personService.deletePersonInfo(id);
		//delete:http://localhost:9898/persons/deleteById?id=3//it returns nothing because "void"
	}
		
	
		
	


	
	
	

}
