package org.example.oops;

public class Manager extends Employee{
    String department;

    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public Manager(Employee e1, String Department) {
        super(e1);
        this.department=Department;
    }

    @Override
    public void displayInfo() {
        System.out.println(name+" and Salary is :"+salary+" and department : "+department);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Harihar Banchoor",10000);
        Manager m1 = new Manager("Lukesh Patel",1300000,"CEO");
        Manager m2=new Manager(e1,"Testing");
        m1.displayInfo();
        e1.displayInfo();
        m2.displayInfo();
    }
}
