package dev.fullstackcode.eis.springbootnativeimage.service;


import dev.fullstackcode.eis.springbootnativeimage.entity.Department;
import dev.fullstackcode.eis.springbootnativeimage.entity.Employee;
import dev.fullstackcode.eis.springbootnativeimage.repository.DepartmentRepository;
import dev.fullstackcode.eis.springbootnativeimage.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Boolean updateEmpDepartment(Integer emp_id , Integer dept_id) {
        Employee employee = employeeRepository.getById(emp_id);
        if(employee == null) {
            throw new RestClientException("Employee with id "+emp_id+" not found");
        }

        Department department = departmentRepository.getById(dept_id);
        if(department == null) {
            throw new RestClientException("Department with id "+dept_id+" not found");
        }

        employee.setDepartment(department);
        employeeRepository.save(employee);

        return true;
    }
}
