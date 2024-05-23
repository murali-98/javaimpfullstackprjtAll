package com.dxc.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.emp.entity.Employee;



@Repository
public interface EmpRepository  extends JpaRepository<Employee, Integer>{

}
