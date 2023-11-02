package practice;

public class Methods1 {
    public static void main(String[] args) {

        int a, b;// opredelili nujnie nam peremenie

        a = 3;
        b = 4;
        int c = hipotenusa(a, b); // kvadrat gipotenusa

        System.out.println(c);

        int d = 37;
        int mod = modul(d);//modul, smeni snaka chisla
        System.out.println(mod);

        int f = 20;
        int kub = cub(f);// cub chisla
        System.out.println(kub);

    }
public  static int cub(int x){
        return x * x * x;
}
    public static int modul(int d) {
        return -d;

    }

    public static int hipotenusa(int a, int b) {
        return a * a + b * b;


    }


}
