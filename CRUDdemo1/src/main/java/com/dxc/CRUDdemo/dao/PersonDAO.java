package com.dxc.CRUDdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.CRUDdemo.entity.Person;
@Repository
public interface PersonDAO extends JpaRepository<Person,Long> {

}
