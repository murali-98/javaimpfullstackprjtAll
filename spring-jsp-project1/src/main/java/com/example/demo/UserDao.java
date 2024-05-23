package com.example.demo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Integer> 
{
	boolean existsByUsername(String username);
	boolean existsByPasswrd(String passwrd);
}
