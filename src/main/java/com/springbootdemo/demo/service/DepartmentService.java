package com.springbootdemo.demo.service;

import com.springbootdemo.demo.entity.Department;
import com.springbootdemo.demo.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside department service");
        return departmentRepository.save(department);

    }

    public Department findDepartmentById(Long departmentId){
        return departmentRepository.findAllByDepartmentId(departmentId);
    }
}
