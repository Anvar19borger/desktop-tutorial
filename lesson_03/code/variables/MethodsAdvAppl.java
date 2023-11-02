package variables;

public class MethodsAdvAppl {
    public static void main(String[] args) {
        //dlina okrujnasti L = Pi * r
        double constanta = pi();
        System.out.println(constanta);
        printPi(constanta);
        double res = circleLenght(100);// v skobkach _ eto radius naschei okkrugnosti
        System.out.println("L = " + res);
    }

    public static double circleLenght(double radius){
        double l = 2 *pi() * radius;
        return l;
    }

    public static void printPi(double p) {// etot metod prosto dla pechati
        System.out.println("Pi = " + p);
    }


    public static double pi() {// double -  metod dolgen vernut takoi tip
        double pi = 3.1415926;
        return pi;

    }


}
