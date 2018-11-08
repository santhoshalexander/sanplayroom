package com.pracitice.san.repository;

import org.springframework.data.repository.CrudRepository;

import com.pracitice.san.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
