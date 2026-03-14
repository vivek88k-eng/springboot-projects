package main.java.com.example.emp_parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Employee;
import com.example.demo.entity.ParkingSpace;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee emp) {
        return service.createEmployee(emp);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return service.getEmployee(id);
    }

    @PutMapping("/updateParking/{id}")
    public Employee updateParking(@PathVariable Long id,
                                  @RequestBody ParkingSpace space) {

        return service.updateParking(id, space);
    }

    @DeleteMapping("/deleteParking/{id}")
    public String deleteParking(@PathVariable Long id) {
        return service.deleteParking(id);
    }
}