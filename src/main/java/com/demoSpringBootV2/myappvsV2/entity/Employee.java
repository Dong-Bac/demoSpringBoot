package com.demoSpringBootV2.myappvsV2.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="employee" )
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "first_name", nullable=false)
    private String firstname;
    @Column(name="last_name")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name="address")
    private String address;
    @Column(name = "salary")
    private float salary;

    //Constractor
    public Employee(){}

    public Employee(String firstname, String lastname, String email, String address, float salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.salary=salary;
    }

    //getting
    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public float getSalary(){
        return salary;
    }
    //setting
    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(float salary){
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee employee1=new Employee("Dong","Bac","dongbac@gmail.com","nghe an",1500);
        System.out.println(employee1.toString());
    }
}
