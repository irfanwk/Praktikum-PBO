import java.util.ArrayList;

class Employee{
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate) {
        double salary = hoursWorked * hourlyRate;
        if (withBonus) {
            salary += 1000;
        }
        return salary;
    }
}

class SoftwareEngineer extends Employee {
    @Override
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return super.calculateSalary(hoursWorked, hourlyRate) + 2000;
    }
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate) {
        double salary = super.calculateSalary(withBonus, hoursWorked, hourlyRate);
        if (withBonus) {
            salary += 2000;
        }
        return salary;
    }
}

class DataScientist extends Employee {
    @Override
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return super.calculateSalary(hoursWorked, hourlyRate) + 3000;
    }
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate) {
        double salary = super.calculateSalary(withBonus, hoursWorked, hourlyRate);
        if (withBonus) {
            salary += 3000;
        }
        return salary;
    }
}

class Intern extends Employee {
    @Override
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return super.calculateSalary(hoursWorked, hourlyRate) + 500;
    }
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate) {
        double salary = super.calculateSalary(withBonus, hoursWorked, hourlyRate);
        if (withBonus) {
            salary += 500;
        }
        return salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SoftwareEngineer());
        employees.add(new DataScientist());
        employees.add(new Intern());
        for (Employee employee : employees) {
            System.out.println(employee.calculateSalary(true, 8, 10.0));
        }
    }
}
