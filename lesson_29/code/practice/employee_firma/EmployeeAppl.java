package practice.employee_firma;

import practice.employee_firma.model.Employee;
import practice.employee_firma.model.Manager;
import practice.employee_firma.model.SalesManager;
import practice.employee_firma.model.Worker;

public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[]empl = new Employee[4];
        empl[0] = new Manager(100,"Jhon","Smith",45,160,5000,5);
        empl[1] = new SalesManager(101,"Anna","Bauer",36,160,25000,0.1);
        empl[2] = new SalesManager(102,"Tomas","Schmid",28,160,3000,0.1);
        empl[3] = new Worker(103,"Gans","Schuster",30,160,5);

        double total = totalSalary(empl);// visivaemm metod dlja rascheta sarplati
        System.out.println("Total salary: " + total);
        double average = averageAge(empl);
        System.out.println("Average age: " + average);

    }
    private static double totalSalary(Employee[]empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null){
                sum += empl[i].calcSalary();

            }

        }
        return sum;
    }
    private static double averageAge(Employee[]empl){
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if (empl[i] != null){
                average += empl[i].getEge();

            }

        }
        return average / empl.length;
    }
}
