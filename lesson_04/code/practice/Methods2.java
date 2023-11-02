package practice;

public class Methods2 {
    public static void main(String[] args) {
        int a = 41;
        int n = divBy2(a);
        System.out.println(n);
        System.out.println("==================");

        int b = 83;
        int m = divBy5(b);
        System.out.println(m);
        System.out.println("==================");

        int  number = 99;
        int res = sumDigits(number);
        System.out.println(res);
        System.out.println("=======================");

    }
    public static  int sumDigits(int n){
        //pervuju cifru poluchit,  poluchiot vtoruju, slojit cifri
        int c1 = n / 10;

        int c2 = n % 10;

        return c1 + c2;


    }
public  static int divBy5(int num){
        return num / 5;
}

    public static int divBy2(int a) {
        return a % 2;

    }


}
