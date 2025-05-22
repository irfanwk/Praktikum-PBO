import java.lang.reflect.Array;
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
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate, double bonus) {
        double salary = super.calculateSalary(withBonus, hoursWorked, hourlyRate);
        if (withBonus) {
            salary += bonus;
        }
        return salary;
    }
}

class DataScientist extends Employee {
    @Override
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return super.calculateSalary(hoursWorked, hourlyRate) + 3000;
    }
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate, double bonus) {
        double salary = super.calculateSalary(withBonus, hoursWorked, hourlyRate);
        if (withBonus) {
            salary += bonus;
        }
        return salary;
    }
}

class Intern extends Employee {
    @Override
    public double calculateSalary(int hoursWorked, double hourlyRate) {
        return super.calculateSalary(hoursWorked, hourlyRate) + 500;
    }
    public double calculateSalary(boolean withBonus, int hoursWorked, double hourlyRate, double bonus) {
        double salary = super.calculateSalary(withBonus, hoursWorked, hourlyRate);
        if (withBonus) {
            salary += bonus;
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
            if (employee instanceof SoftwareEngineer) {
                System.out.println("Software Engineer Salary: " + employee.calculateSalary(40, 50));
                System.out.println("Software Engineer Salary with Bonus: "+ ((SoftwareEngineer) employee).calculateSalary(true, 40, 50, 2000));
            } else if (employee instanceof DataScientist) {
                System.out.println("Data Scientist Salary: " + employee.calculateSalary(40, 60));
                System.out.println("Data Scientist Salary with Bonus: " + ((DataScientist) employee).calculateSalary(true, 40, 60, 3000));
            } else if (employee instanceof Intern) {
                System.out.println("Intern Salary: " + employee.calculateSalary(20, 20));
                System.out.println("Intern Salary with Bonus: " + ((Intern) employee).calculateSalary(true, 20, 20, 500));
            }
        }
    }
}
