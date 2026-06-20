package exercise4;

import java.util.ArrayList;

class Employee {

    int employeeId;
    String employeeName;
    String employeePosition;
    double employeeSalary;

    Employee(int employeeId, String employeeName,
             String employeePosition, double employeeSalary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }

    void display() {

        System.out.println(
                "Employee Id : " + employeeId +
                ", Employee Name : " + employeeName +
                ", Employee Position : " + employeePosition +
                ", Employee Salary : " + employeeSalary);

    }
}

class Employees {

    ArrayList<Employee> employee = new ArrayList<>();

    void addEmployee(Employee e) {

        employee.add(e);

    }

    void deleteEmployee(int id) {

        for (int i = 0; i < employee.size(); i++) {

            if (employee.get(i).employeeId == id) {

                employee.remove(i);
                return;

            }

        }

        System.out.println("Employee not found");

    }

    Employee search(int target) {

        for (int i = 0; i < employee.size(); i++) {

            if (employee.get(i).employeeId == target) {

                return employee.get(i);

            }

        }

        return null;

    }

    void display() {

        for (int i = 0; i < employee.size(); i++) {

            employee.get(i).display();

        }

    }

}

public class EmployeeManagementSystem {

    public static void main(String args[]) {

        Employees employee = new Employees();

        employee.addEmployee(
                new Employee(101, "Karthik",
                        "FrontEnd Developer", 30000));

        employee.addEmployee(
                new Employee(102, "Mohan",
                        "Editor", 25000));

        employee.addEmployee(
                new Employee(103, "Chetan",
                        "Coder", 35000));

        employee.display();

        Employee em = employee.search(103);

        if (em != null) {

            System.out.println("\nEmployee Found:");

            em.display();

        }

        employee.deleteEmployee(102);

        System.out.println("\nAfter deletion:");

        employee.display();

    }

}