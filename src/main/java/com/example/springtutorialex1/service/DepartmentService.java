package com.example.springtutorialex1.service;

import com.example.springtutorialex1.entity.Department;

import java.util.List;


public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartment();

    Department fetchDepartmentById(Long id);

    void deleteDepartmentById(Long id);

    Department updateDepartment(Long id, Department department);

    Department findByDepartmentName(String departmentName);
}


