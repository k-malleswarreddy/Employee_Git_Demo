package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;
												//JpaRepository<entity class , data type>
public interface EmployeeRepository extends JpaRepository<Employee , Integer>{
	/*
	 * 1.persist() 2.merge() 3.remove(); 4.find()
	 */
	// createQuery()--> for multi row operation
	
	@Query("select e from Employee e where e.empDesg=?1")
	public abstract List<Employee> getEmployeesByDesg(String empDesg);
	@Query("select e from Employee e where e.empSal between ?1 and ?2")
	public abstract List<Employee>	 getEmployeesBetweenSal(int initialSal, int finalSal);

}
