package com.demoSpringBootV2.myappvsV2.servece;


import com.demoSpringBootV2.myappvsV2.entity.Employee;

import java.util.List;

public interface ServerceEmployee {

    List<Employee> getAllStudents();
    Employee saveEmployee(Employee employee);

    Employee getIDEmployee(Long id);

    Employee updateEmployee(Employee employee);
    Employee delEmployee(Long id);
}
