package homework;

//Task 1. Print out all numbers less than 200 and multiples of 13.

public class Nambers {
    public static void main(String[] args) {

        int number = 1;

        while (number  <= 200) {// logical conditions
            if (number % 13== 0){
                System.out.print(number + " | " );
            }
            number++;
        }
        System.out.println();
        System.out.println(" Done! ");// sakonchili
    }
}

