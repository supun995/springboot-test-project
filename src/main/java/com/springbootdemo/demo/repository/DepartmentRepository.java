package com.springbootdemo.demo.repository;

import com.springbootdemo.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findAllByDepartmentId(Long departmentId);
}
