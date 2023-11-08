package practice.try_catch;

import java.util.Scanner;

public class TryCatchAppl {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input first  nummber:");
            int a = scanner.nextInt();
            System.out.println("Input first  nummber:");
            int b = scanner.nextInt();
            int division = a/ b;
            System.out.println(" Division " + a + " / " + b + " = " + division);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }


}
