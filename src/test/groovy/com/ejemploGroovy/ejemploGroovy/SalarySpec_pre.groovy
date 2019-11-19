package com.ejemploGroovy.ejemploGroovy

import spock.lang.Specification

class SalarySpec_pre extends Specification {

    def "As salary manager I need to modify the salary employee #id by #percent percent " () {
        given: "the salary management system is initialized with the following data"
        [
                [1, 'donald', 60000.0],
                [2, 'dewie', 62000.0],
                [3, 'goofy', 55000.0],
                [4, 'scrooge', 70000.0],
                [5, 'daisy', 56000.0],
                [6, 'minnie', 62000.0],
                [7, 'mickey', 51000.0],
                [8, 'fethry', 66500.0]
        ]
        when: "the Salary Manager increases the salary for the employee with 'id' by 'percent' % as per data table"
        then: "the payroll for the employee with 'id' should display a salary of 'expected' as per data table"
        where:
        id  | percent || expected
        1   |   2     || 61200.0
        2   |   7     || 66340.0
        3   |   5     || 57750.0
        4   |   12    || 78400.0
        5   |   -2    || 54880.0
        6   |   4     || 64480.0
        7   |   -7    || 47430.0
        8   |   0     || 66500.0
    }
}
