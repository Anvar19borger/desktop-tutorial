package practice;

public class HW05 {
    public static void main(String[] args) {

       double a = 6;
        double b = 8;
       double c = 7;
        String no =  "Треугольник не существует : " ;
        String yes =  "Треугольник существует.";
        if (a == 0 | b == 0 | c == 0){
            System.out.println(no);
        }
        else if (a > (b + c)){
            System.out.println(no);
        }
        else if (b > (a + c)){
            System.out.println(no);
        }
        else if (c > (a + b)){
            System.out.println(no);
        }
        else{
            System.out.println(yes);
        }
    }
}







