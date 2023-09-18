package com.example.springtutorialex1.service;

import com.example.springtutorialex1.entity.Department;
import com.example.springtutorialex1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    public DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(new Department());
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department department1 = departmentRepository.findById(id).get();
        if(Objects.nonNull(department.getDepartmentAddress())&& !department.getDepartmentAddress().isEmpty()){
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentName())&& !department.getDepartmentName().isEmpty()){
            department1.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode())&& !department.getDepartmentCode().isEmpty()){
            department1.setDepartmentCode(department.getDepartmentCode());
        }
        return departmentRepository.save(department1);
    }

    @Override
    public Department findByDepartmentName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }
}
