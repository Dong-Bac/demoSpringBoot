package com.demoSpringBootV2.myappvsV2.repository;

import com.demoSpringBootV2.myappvsV2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmployee  extends JpaRepository<Employee,Long> {
}
