package com.pos.service;

import com.pos.model.Employee;
import com.pos.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public void updateEmp(Integer emp_id, Employee emp) {
        Employee employee = employeeRepository.findById(emp_id).get();
        employeeRepository.save(emp);
    }
}
