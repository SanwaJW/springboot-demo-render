package com.example.springtutorialex1.controller;

import com.example.springtutorialex1.entity.Department;
import com.example.springtutorialex1.repository.DepartmentRepository;
import com.example.springtutorialex1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
    return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartment(){
        return departmentService.fetchDepartment();
    }

    @GetMapping("/department/{Id}")
    public Department fetchDepartmentById(@PathVariable("Id") Long Id){
        return departmentService.fetchDepartmentById(Id);
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long Id){
        departmentService.deleteDepartmentById(Id);
        return "department deleted";
    }

    @PostMapping("/department/{id}")
    public Department updateDepartment(@PathVariable("id") Long id,
                                       @RequestBody Department department){
        return departmentService.updateDepartment(id,department);
    }
    @GetMapping("/department/name/{name}")
    public Department findByDepartmentName(@PathVariable("name") String departmentName){
        return departmentService.findByDepartmentName(departmentName);
    }


}
