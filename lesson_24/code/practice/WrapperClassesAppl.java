package practice;

public class WrapperClassesAppl {
    public static void main(String[] args) {
        // kolichestvo cifer v chesle ,versija 2(delim na 10 do poluchenija 0, cikl weile)
        Integer x = 1_987_654_321;// eto obekt  tipa Integer
        String st = x.toString();// preobrosovanie v straku
        int l = st.length();// usnali dlinu stroki
        System.out.println(" Number of digits in " + x + " = " + l);
        System.out.println(x.MAX_VALUE);// usnali maximalnoe snachenija dlja tokogo tipa
        Double y = 32456.78;
        String  st1 = y.toString();
        System.out.println(" Number of digits in " + y + " = " + st1.length());

        //prisvoeenie i vicheslenie
        int n = 20;
        Integer m = 10;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        m = m + n;// avto raspokovka i avto upakovka m
        System.out.println("m + n = " + m);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println("Cicle length = " + circleLength);
        System.out.printf("Cicle length = %.2f ",  circleLength);

        //constanti classov obeertok
        System.out.println("--------------------------Constanc of Wrapper Classes");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Long MIN " + Long.MIN_VALUE);
        System.out.println("Double MAX " + Double.MAX_VALUE);
        System.out.println("Double MIN " + Double.MIN_VALUE);

        // obrabotka delenija na 0
        System.out.println("-------- Not-a-Number (NaN)---------");
        double a = 20.0 / 0 ;
        if (Double.isInfinite(a) || Double.isNaN(a)){// poluchilos beskonechnost ili  ne suchestvuechie chislo
            System.out.println("Wrong operation or wrong result. ");

        }else {
            System.out.println(a);
        }
        // peerivod stroki v nomer
        System.out.println("----- Parsing String to number----");
        String str = "0987654321";
        int num = Integer.parseInt(str);
        System.out.println("String  " + str + " = " + num);

        String str1 = "2.7118281828";
        double exp = Double.parseDouble(str1);
        System.out.println("Exp = " + exp );

    }
}
