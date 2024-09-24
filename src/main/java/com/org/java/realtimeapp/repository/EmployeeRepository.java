package com.org.java.realtimeapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.java.realtimeapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByEmpName(String empName);

	List<Employee> findByPlateform(String plateform);

	Optional<Employee> findByEmpId(int empId);

	Employee findByEmpNameAndPlateform(String empName, String plateform);

	Employee findByEmpIdAndEmpNameAndPlateform(int empId, String empName, String plateform);

}
