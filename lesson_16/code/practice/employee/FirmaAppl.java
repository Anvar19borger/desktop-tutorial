package practice.employee;

import practice.employee.model.Employee;

public class FirmaAppl {
    public static void main(String[] args) {

        Employee empel1 = new Employee(1, "Jhon ", "Smit ", 36, 24000, true);
        Employee empel2 = new Employee(2, "Mary", " Poppins", 35, 24000, false);

        empel1.display();
        empel2.display();


        double totalSalary = empel1.getSalary() + empel2.getSalary();
        System.out.println(" Total salary " + totalSalary + " € ");


        empel1.work();
        empel1.lunch();
        empel1.sleep();
    }
}
