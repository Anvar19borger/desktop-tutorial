package practice.employee_firma.model;

public class Worker extends Employee {
    private double grade;

    public Worker(int id, String firstName, String lastName, int ege, double hours, double wage) {
        super(id, firstName, lastName, ege, hours);
        this.grade = wage;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}
