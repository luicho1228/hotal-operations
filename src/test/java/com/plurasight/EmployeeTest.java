package com.plurasight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        Employee employee = new Employee();
        Employee employee = new Employee();

        // Act
        employee.punchIn(9);
        employee.punchOut(17);

        // Assert
        assertEquals(8, employee.getHoursWorked());
    }

    @Test
    void punchOut() {
    }
}