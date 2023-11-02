package practice.company_v1.dao;

import practice.company_v1.model.Employee;

// - добавить сотрудника
// - удалить сотрудника
// - найти сотрудника
// - кол-во сотрудников
// - ФОТ
// - средняя з/п
// - объем продаж
// - напечатать список сотрудников
public interface Company {
    // Obevljaem mtodi,tolko signaturi bestela metoda
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int quantity();

    double totalSalary();// FOT- sarplata vsech
    double avgSalary();// srdnjaja sarplata po kampanii, averagee - srednii

    double totalSales();// obem prodaj

   void printEmployees();


   //---------------------------//
   //- список работников, у которых отработано больше часов, чем...
    Employee[] findEmployeesHoursGreaterThan(int hours);
  //- список работников, у которых зарплата в интервале от... и до...
    Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);




}
