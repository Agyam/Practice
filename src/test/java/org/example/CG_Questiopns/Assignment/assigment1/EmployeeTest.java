package org.example.CG_Questiopns.Assignment.assigment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class EmployeeTest {

    @Test
    void testValidEmployeeMumbai() throws InvalidEmployeeException {
        Employee e = new Employee(101, "AmitKumar", "ABCDE0123M", LocalDate.of(2022, 6, 15));
        assertEquals("Mumbai", e.getCity());
        assertTrue(e.getExperienceInYears() >= 1);
    }

    @Test
    void testValidEmployeePune() throws InvalidEmployeeException {
        Employee e = new Employee(102, "SureshRaj", "FGHIJ0456P", LocalDate.of(2021, 5, 20));
        assertEquals("Pune", e.getCity());
    }

    @Test
    void testInvalidNameTooShort() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(103, "Raj", "ABCDE0123M", LocalDate.now());
        });
        assertEquals("Employee name must be between 5 to 10 characters!", ex.getMessage());
    }

    @Test
    void testInvalidNameLowerCaseStart() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(104, "vikasSing", "ABCDE0123M", LocalDate.now());
        });
        assertEquals("Employee name must start with a capital letter!", ex.getMessage());
    }

    @Test
    void testInvalidPanTooShort() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(105, "SunilPat", "ABCD0123M", LocalDate.now());
        });
        assertEquals("PAN number must be exactly 10 characters long!", ex.getMessage());
    }

    @Test
    void testInvalidPanLowercaseStart() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(106, "SunilPat", "abcde0123M", LocalDate.now());
        });
        assertEquals("First five characters of PAN must be uppercase letters!", ex.getMessage());
    }

    @Test
    void testInvalidPanDigitsWrongFormat() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(107, "AjayKumar", "ABCDE9876M", LocalDate.now());
        });
        assertEquals("PAN digits must be 4 digits starting with 0!", ex.getMessage());
    }

    @Test
    void testInvalidPanLastCharLowercase() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(108, "AjayKuma", "ABCDE0123m", LocalDate.now());
        });
        assertEquals("Last character of PAN must be an uppercase letter!", ex.getMessage());
    }

    @Test
    void testInvalidPanUnknownCityCode() {
        Exception ex = assertThrows(InvalidEmployeeException.class, () -> {
            new Employee(109, "RohitVer", "ABCDE0123X", LocalDate.now());
        });
        assertEquals("Invalid city code in PAN!", ex.getMessage());
    }

    @Test
    void testExactlyOneYearExperience() throws InvalidEmployeeException {
        LocalDate oneYearAgo = LocalDate.now().minusYears(1);
        Employee e = new Employee(110, "VikasPat", "ABCDE0123M", oneYearAgo);
        assertEquals(1, e.getExperienceInYears());
    }
}

