package dev.fullstackcode.eis.springbootnativeimage.controller;


import dev.fullstackcode.eis.springbootnativeimage.entity.Employee;
import dev.fullstackcode.eis.springbootnativeimage.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value="/{id}")
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

}
