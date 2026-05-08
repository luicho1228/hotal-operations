package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        Employee employee = new Employee();
        employee.punchIn(9);
        assertEquals(9,employee.getStartTime());

    }

    @Test
    void punchOut() {
        Employee employee = new Employee();
        employee.punchIn(9);
        employee.punchOut(6);
        assertEquals(9,employee.getRegularHours());
    }
}