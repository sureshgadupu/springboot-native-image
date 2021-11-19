package dev.fullstackcode.eis.springbootnativeimage.repository;


import dev.fullstackcode.eis.springbootnativeimage.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  EmployeeRepository extends JpaRepository<Employee,Integer> {
}
