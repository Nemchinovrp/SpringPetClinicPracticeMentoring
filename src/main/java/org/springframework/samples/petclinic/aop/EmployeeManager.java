package org.springframework.samples.petclinic.aop;

import java.util.List;

public interface EmployeeManager {
    public EmployeeDTO getEmployeeById(Integer employeeId);

    public List<EmployeeDTO> getAllEmployee();

    public void createEmployee(EmployeeDTO employee);

    public void deleteEmployee(Integer employeeId);

    public void updateEmployee(EmployeeDTO employee);

    public List<EmployeeDTO> findAll();
}
