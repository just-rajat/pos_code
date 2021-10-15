package com.pos.controller;

import com.pos.model.Employee;
import com.pos.repository.EmployeeRepository;
import com.pos.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeApiController {

   @Autowired EmployeeRepository employeeRepository;
   @Autowired EmployeeService employeeService;

    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    @PostMapping("/addEmp")
    public ResponseEntity<Object> addEmployee(Employee employee){
        HashMap<String,Object> user = new HashMap<String, Object>();
        employeeRepository.save(employee);
        user.put("message","success");
        user.put("res_code","200");
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @CrossOrigin
    @GetMapping("/getEmployee/{empid}")
    public Employee getEmployee(@PathVariable Integer empid){
        return employeeRepository.findById(empid).get();
    }

    @CrossOrigin
    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmp(){
        return (List<Employee>) employeeRepository.findAll();
    }

    @PutMapping("/updateStatus/{empid}")
    public Employee changeStatus(@PathVariable Integer empid,@RequestParam("status") Boolean stat){
        Employee e = employeeRepository.findById(empid).get();
        e.setIs_active(stat);
        e.setModified_on(new Date());
        return employeeRepository.save(e);
    }
    @PutMapping({"/updateEmp/{empid}"})
    public void updateEmployee(@PathVariable Integer empid, Employee emp, BindingResult result){
        Employee e = employeeRepository.findById(empid).get();
        e.setEmail(emp.getEmail());
        e.setLocations(emp.getLocations());
        e.setName(emp.getName());
        e.setPasscode(emp.getPasscode());
        e.setPassword(emp.getPassword());
        e.setPhone(emp.getPhone());
        e.setRoles(emp.getRoles());
        e.setUsername(emp.getUsername());
        e.setIs_active(emp.getIs_active());
        e.setModified_on(new Date());
        employeeRepository.save(e);
    }

    @PutMapping("/updatePass/{id}")
    public Employee changePass(@PathVariable Integer id,
                               @RequestParam("new_pass") String newpass){
        Employee emp = employeeRepository.findById(id).get();
        emp.setPassword(newpass);
        emp.setModified_on(new Date());
        return employeeRepository.save(emp);
    }
}
