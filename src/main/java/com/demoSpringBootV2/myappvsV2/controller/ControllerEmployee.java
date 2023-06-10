package com.demoSpringBootV2.myappvsV2.controller;

import com.demoSpringBootV2.myappvsV2.entity.Employee;
import com.demoSpringBootV2.myappvsV2.servece.ServerceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerEmployee {
    @Autowired
    private ServerceEmployee serverceEmployee;

    public ControllerEmployee(ServerceEmployee serverceEmployee){
        this.serverceEmployee=serverceEmployee;
    }

    // read data
    @GetMapping("/")
    public String getEmployee(Model model){
       model.addAttribute("employees",serverceEmployee.getAllStudents());
        return "employee";

    }

    // create data
    @GetMapping("/employee/new")
    public String createEmployee(Model model){
        Employee employee =new Employee();
        model.addAttribute("employee",employee);
        return "create_employee";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        serverceEmployee.saveEmployee(employee);
        return "redirect:/";
    }

    // update data
    @GetMapping("employee/edit/{id}")
    public String getId(@PathVariable Long id, Model model){
        model.addAttribute("employee",serverceEmployee.getIDEmployee(id));
        return "edit_employee";
    }
    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee){
        Employee exitsEmployee=serverceEmployee.getIDEmployee(id);
        exitsEmployee.setId(id);
        exitsEmployee.setFirstname(employee.getFirstname());
        exitsEmployee.setLastname(employee.getLastname());
        exitsEmployee.setEmail(employee.getEmail());
        exitsEmployee.setAddress(employee.getAddress());
        exitsEmployee.setSalary(employee.getSalary());
        serverceEmployee.saveEmployee(exitsEmployee);
        return "redirect:/";
    }

    // delete data
    @GetMapping("/employee/{id}")
    public String delEmployee(@PathVariable Long id){
        serverceEmployee.delEmployee(id);
        return "redirect:/";
    }

}
