package SalaryCalc;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            double tax = this.salary * 0.03;
            this.salary = this.salary - tax;
            return tax;
        } else return 0;
    }

    public double bonus() {
        if (this.workHours > 40) {
            int bonus = (this.workHours-40) * 30;
            this.salary += bonus;
            return bonus;
        } else return 0;
    }

    public double raiseSalary() {
        double val = 0;
        if (2021 - this.hireYear < 10) {
            val = this.salary * 0.05;
            this.salary += val;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            val = this.salary * 0.1;
            this.salary += val;
        } else if (2021 - this.hireYear > 19) {
            val = this.salary * 0.15;
            this.salary += val;
        }
        return val;
    }

    @Override
    public String toString() {

        return "Name: " + this.name +
                "\nSalary: " + this.salary +
                "\nWork Hours: " + this.workHours +
                "\nHire Year: " + this.hireYear +
                "\nTax Amount: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary raise amount: " + raiseSalary()+
                "\nTotal salary: "+this.salary;
    }
}
