public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Calculate the tax based on the salary
    public double tax() {
        if (this.salary < 1000.0) {
            return 0.0;
        } else {
            return (salary * 0.03);
        }
    }

    // Calculate the bonus based on the extra work hours
    public double bonus() {
        int extraHours = workHours - 40;
        if (workHours > 40) {
            return (extraHours * 30);
        }
        return (0);
    }

    // Calculate the new salary based on the years of work
    public double raiseSalary() {
        int currentYear = 2021; // Assume the current year is 2021
        int yearsOfWork = currentYear - hireYear;
        double newSalary;

        if (yearsOfWork < 10) {
            newSalary = salary + salary * 0.05;
        } else if (yearsOfWork < 20) {
            newSalary = salary + salary * 0.1;
        } else {
            newSalary = salary + salary * 0.15;
        }
        return (newSalary);
    }

    // Convert the Employee object to a string representation
    public String toString() {
        String result = "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Increase: " + (raiseSalary() - salary) +
                "\nSalary with Tax and Bonuses: " + (salary + tax() + bonus()) +
                "\nTotal Salary: " + (raiseSalary() + tax() + bonus());
        System.out.println(result);
        return (result);
    }
}