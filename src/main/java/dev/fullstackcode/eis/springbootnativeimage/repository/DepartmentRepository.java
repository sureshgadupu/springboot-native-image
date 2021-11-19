package dev.fullstackcode.eis.springbootnativeimage.repository;


import dev.fullstackcode.eis.springbootnativeimage.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
