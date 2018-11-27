package com.techprimers.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.db.model.EmployeeDb;

public interface EmployeeDbRepository extends JpaRepository<EmployeeDb, Integer>{

}
