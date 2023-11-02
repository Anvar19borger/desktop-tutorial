package homework15;

//Task 4.(*) Implement a way to exchange the values of two variables of integer type without using a third variable.
// Ideally, write a method swap(a, b).

public class SwapHw {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("==============");
        System.out.println("Calling the method 'swap()'; We are waiting for the exchange of values '");
        ArrayMethHw.swap(a, b);
    }
}
