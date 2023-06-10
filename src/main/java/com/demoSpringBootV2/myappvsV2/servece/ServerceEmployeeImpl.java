package com.demoSpringBootV2.myappvsV2.servece;


import com.demoSpringBootV2.myappvsV2.entity.Employee;

import com.demoSpringBootV2.myappvsV2.repository.RepositoryEmployee;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServerceEmployeeImpl implements ServerceEmployee{

    private RepositoryEmployee repositoryEmployee;
    public ServerceEmployeeImpl(RepositoryEmployee repositoryEmployee){
        this.repositoryEmployee= repositoryEmployee;
    }
    @Override
    public List<Employee> getAllStudents() {
        return repositoryEmployee.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return repositoryEmployee.save(employee);
    }

    @Override
    public Employee getIDEmployee(Long id) {
        return repositoryEmployee.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return repositoryEmployee.save(employee);
    }

    @Override
    public Employee delEmployee(Long id) {
         repositoryEmployee.deleteById(id);
        return null;
    }


}
