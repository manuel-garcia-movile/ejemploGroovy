package com.ejemploGroovy.ejemploGroovy.service

import com.ejemploGroovy.ejemploGroovy.dto.Employee

class SalaryManager {

    def employees = new ArrayList<Employee>()

    public SalaryManager(employees){
        this.employees=employees
    }

    public increaseSalary(id, percent){
        def employee = employees.find { e -> e.id == id }
        employee.setSalary(employee.salary + (employee.salary*(percent/100)))
    }

    public getPayroll(id){
        def employee = employees.find { e -> e.id == id }
        employee
    }

}
