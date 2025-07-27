package org.example.CG_Questiopns.Assignment.assigment1;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int empId;
    private String name;
    private String panNo;
    private LocalDate joiningDate;
    private String city;

    public Employee(int empId, String name, String panNo, LocalDate joiningDate) throws InvalidEmployeeException {
        this.empId = empId;
        validateName(name);
        this.name = name;
        validatePan(panNo);
        this.panNo = panNo;
        this.city = getCityFromPan(panNo);
        this.joiningDate = joiningDate;
    }

    private void validateName(String name) throws InvalidEmployeeException {
        if (name.length() < 5 || name.length() > 10)
            throw new InvalidEmployeeException("Employee name must be between 5 to 10 characters!");
        if (!Character.isUpperCase(name.charAt(0)))
            throw new InvalidEmployeeException("Employee name must start with a capital letter!");
    }

    private void validatePan(String panNo) throws InvalidEmployeeException {
        if (panNo.length() != 10)
            throw new InvalidEmployeeException("PAN number must be exactly 10 characters long!");

        if (!panNo.substring(0, 5).matches("[A-Z]{5}"))
            throw new InvalidEmployeeException("First five characters of PAN must be uppercase letters!");

        if (!panNo.substring(5, 9).matches("0[0-9]{3}"))
            throw new InvalidEmployeeException("PAN digits must be 4 digits starting with 0!");

        if (!Character.isUpperCase(panNo.charAt(9)))
            throw new InvalidEmployeeException("Last character of PAN must be an uppercase letter!");
    }

    public int getExperienceInYears() {
        return Period.between(this.joiningDate, LocalDate.now()).getYears();
    }

    private String getCityFromPan(String panNo) throws InvalidEmployeeException {
        char lastChar = panNo.charAt(9);
        switch (lastChar) {
            case 'M': return "Mumbai";
            case 'P': return "Pune";
            case 'K': return "Kolkata";
            case 'B': return "Bangalore";
            default: throw new InvalidEmployeeException("Invalid city code in PAN!");
        }
    }

    public String getCity() {
        return city;
    }

    public String getEmployeeDetails() {
        return "ID: " + empId + ", Name: " + name + ", PAN: " + panNo + ", Joining Date: " + joiningDate + ", City: " + city;
    }
}

