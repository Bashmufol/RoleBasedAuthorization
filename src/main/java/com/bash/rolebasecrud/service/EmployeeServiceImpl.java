package com.bash.rolebasecrud.service;

import com.bash.rolebasecrud.dao.EmployeeRepository;
import com.bash.rolebasecrud.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl extends EmployeeService{
    private final EmployeeRepository repository;
    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public Employee findById(int theId) {
        return null;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return null;
    }

    @Override
    public void deleteById(int theId) {

    }
}
