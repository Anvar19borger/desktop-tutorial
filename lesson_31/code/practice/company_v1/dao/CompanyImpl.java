package practice.company_v1.dao;

import practice.company_v1.model.Employee;
import practice.company_v1.model.SalesManager;


public class CompanyImpl implements Company {
    // dobovljaemm 2 polja katori opisivajut  companiju
    private Employee[] employees;//  Massiv dlja hronenija  sotrudnikov
    private int size;// tekuschie kolichestvo sadtrudnikov

    //konstruktor
    public CompanyImpl(int capacity) {
        employees = new Employee[capacity];// capacyti - maksimalni rasmer kampanii
    }


    @Override
    public boolean addEmployee(Employee employee) {
        // ne dovljaem null , ne previschaem capaciti, ne dobovljaem suschistvueschi
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }

        // employees[size] = employee;// novi eliment
        //  size++;
        employees[size++] = employee;// postfiksnaja operacija ++
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee victim = employees[i];// ubrali naideni elimment v peremennuju
                //   employees[i] = employees[size - 1];// eto mi na mesto naidenogo  pastaveli poslednigo suschestvueschigo v masive
                // employees[size - 1] = null; // obnulili poslednego
                // size--;
                // mojno napisat koroche eto budit TODO
                employees[i] = employees[--size];// prefiksnaja operacija --
                employees[size] = null;// obnuljaem poslednii  eliment
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {// nascholsja eliment masiva ,u kotorogo sovpal id
                return employees[i];// vernuli naidenego elimenta massiva tipa Emploiyee

            }

        }

        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;

    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {

            if (employees[i] instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) employees[i];// proveli kasting
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    //  Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
    // сначала подсчитать количество элементов массива, удовлетворяющих условию.
    //потом создать массив под это количество,
    //и только потом его заполнить.
    //Для реализации такой функциональности, мы создаем методы возвращающие массив.
    // Тестирование методов возвращающих массив, осуществляется при помощи assertArrayEquals.

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;
        // schitaem skolko budet elementov massiva , udoletvorjajuschich  usloviju
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count];// sasdoem masiv rasmera count
        // sapolnenija massiva
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].getHours() > hours) {
                res[j++] = employees[i];
            }
        }
        return res;// eto vosvrascheni masiv
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        // schitaem skolko budet elementov massiva , udoletvorjajuschich  usloviju
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee[] res = new Employee[count];// sasdoem masiv rasmera count
        // sapolnjaem masiv res
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                res[j++] = employees[i];
            }
        }
        return res;// eto vosvrascheni masiv
    }
}
