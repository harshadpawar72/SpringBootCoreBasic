package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public String sayHello()
    {
        return "Welcome";
    }
    @GetMapping("/service")
    public String sayService()
    {
        return "Full Stack Java Devloper";
    }
    @GetMapping("/myname")
    public  String m1()
    {
        return "AKSHAY PARDESHI..!";
    }

    @GetMapping("/showData")
    public List<Employee> showData()
    {
        List<Employee> empList=new LinkedList<>();
        empList.add(new Employee(555, "Harshad"));
        empList.add(new Employee(456, "Ram"));
        return empList;
    }
}
class Employee
{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
