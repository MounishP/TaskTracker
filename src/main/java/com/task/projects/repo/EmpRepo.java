package com.task.projects.repo;

import com.task.projects.model.AddEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<AddEmployee,String> {
}
