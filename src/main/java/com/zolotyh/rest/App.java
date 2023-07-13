package com.zolotyh.rest;

import com.zolotyh.rest.cofiguration.MyConfig;
import com.zolotyh.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        Employee empById = communication.getEmployee(1);
        System.out.println(empById);

        Employee employee = new Employee(6, "Andrey", "Trofimov", "IT", 1500);
        communication.saveEmployee(employee);

        communication.deleteEmployee(6);
    }
}
