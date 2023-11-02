package homework;
//Задача 1. Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%,
// за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.


import java.util.Scanner;

public class Worker {
    public static void main(String[] args) {

       double basicSalary = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Work allowance : ");
      int allowance = scanner.nextInt();

        switch (allowance) {

            case 1:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 2:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }



            case 3: {
                System.out.println("Work allowance : 10%");
                basicSalary = basicSalary + basicSalary * 0.1;
                System.out.println("За 3 года работы надбавка 10% : " + basicSalary + "$");
                break;

            }
            case 4:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 5: {
                System.out.println("Work allowance : 50%");
                basicSalary = basicSalary + basicSalary * 0.5;
                System.out.println("За 5 лет работы надбавка 50% : " + basicSalary + "$");
                break;
            }
            case 6:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 7:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 8:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 9:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 10: {
                System.out.println("Work allowance : 100%");
                basicSalary = basicSalary + basicSalary * 1.0;
                System.out.println("За 10 лет работы надбавка 100% : " + basicSalary + "$");
                break;
            }
            case 11:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 12:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 13:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 14:{
                System.out.println("Salary hasn´t increased yet !");
                break;
            }
            case 15: {
                System.out.println("Work allowance : 150%");
                basicSalary = basicSalary + basicSalary * 1.5;
                System.out.println("За 15 лет работы надбавка 150% : " + basicSalary + "$");
                break;

            }
            default: {
                System.out.println("Wrong input!");
            }
        }
    }
}

