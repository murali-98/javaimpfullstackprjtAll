package com.am.restfullapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.am.restfullapi.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
