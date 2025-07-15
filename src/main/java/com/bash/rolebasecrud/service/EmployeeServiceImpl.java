package com.bash.rolebasecrud.service;

import com.bash.rolebasecrud.dao.EmployeeRepository;
import com.bash.rolebasecrud.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;
    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = repository.findById(theId);
        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            throw new RuntimeException("The  employee with id " + theId + " does not exist");
        }
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return repository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        repository.deleteById(theId);
    }
}
