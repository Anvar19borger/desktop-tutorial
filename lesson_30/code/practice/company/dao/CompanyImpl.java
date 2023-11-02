package practice.company.dao;

import practice.company.model.Employee;


public class CompanyImpl implements Company {
    // dobovljaemm 2 polja katori opisivajut  companiju
    private Employee[] employees;// Massiv dlja hronenija  sotrudnikov
    private int size;// tekuschie kolichestvo sadtrudnikov

    //konstruktor
    public CompanyImpl(int capacity){
        employees = new Employee[capacity];// capacyti - maksimalni rasmer kampanii
    }


    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }
}
