package com.pos.service;

import com.pos.model.Employee;

public interface EmployeeService {
    public Employee addEmployee(Employee emp);
    public void updateEmp(Integer emp_id, Employee emp);
}
