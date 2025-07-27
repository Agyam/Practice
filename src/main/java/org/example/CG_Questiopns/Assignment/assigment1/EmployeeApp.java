package org.example.CG_Questiopns.Assignment.assigment1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        int count = 0;
        while (count < 20) {
            System.out.println("Enter details for Employee " + (count + 1) + ":");

            try {
                System.out.print("empId: ");
                int empId = Integer.parseInt(sc.next());

                System.out.print("name: ");
                String name = sc.next();

                System.out.print("panNo: ");
                String panNo = sc.next();

                System.out.print("joiningDate (yyyy-MM-dd): ");
                LocalDate joiningDate = LocalDate.parse(sc.next());

                Employee emp = new Employee(empId, name, panNo, joiningDate);
                employees.add(emp);
                System.out.println("Employee added successfully!");
                count++;
            } catch (InvalidEmployeeException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Invalid input format.");
                sc.nextLine(); // consume invalid input
            }

            System.out.println();
        }

        // Stream API - 1 Year Experience
        long experiencedCount = findExperiencedEmployees(employees);
        System.out.println("Employees with at least 1 year experience: " + experiencedCount);

        // Stream API - City-wise count
        Map<String, Integer> cityCount = getCityWiseEmployeeCount(employees);
        System.out.println("City-wise Employee Count: " + cityCount);
    }

    public static long findExperiencedEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getExperienceInYears() >= 1)
                .count();
    }

    public static Map<String, Integer> getCityWiseEmployeeCount(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }
}

