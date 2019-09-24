package org.springframework.samples.petclinic.aop;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
    public EmployeeDTO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new EmployeeDTO();
    }

    public List<EmployeeDTO> getAllEmployee() {
        System.out.println("Method getAllEmployee() called");
        return new ArrayList<EmployeeDTO>();
    }

    public void createEmployee(EmployeeDTO employee) {
        System.out.println("Method createEmployee() called");
    }

    public void deleteEmployee(Integer employeeId) {
        System.out.println("Method deleteEmployee() called");
    }

    public void updateEmployee(EmployeeDTO employee) {
        System.out.println("Method updateEmployee() called");
    }

    public List<EmployeeDTO> findAll() {
        List<EmployeeDTO> dtos = Arrays.asList(new EmployeeDTO(), new EmployeeDTO(), new EmployeeDTO());
        return dtos;
    }
}

