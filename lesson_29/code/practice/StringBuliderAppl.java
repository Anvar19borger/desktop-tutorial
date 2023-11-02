package practice;

public class StringBuliderAppl {
    public static void main(String[] args) {
        // StringBuildr eto klass v nem est polesnie metodi dlja raboti  so strokami
        // append dobovlenie ,prestegivanie

        String str = "Java";
        // str = str +  "_" + 11
        str = str.concat("_");// concant eto dobovlenie
        str = str.concat("" + 11);// k stroke dobovljaem premitiv  int
        System.out.println(str);
        // StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append("_").append(11);
        System.out.println(sb);// obekt sb _ mutirueet
        sb.reverse();// rasvorot stroki , straka sadomm na peered
        System.out.println(sb);
        // mojnoli vernut tip StringBuilder obratno v String?
        str = sb.toString();// da mojno metod toString
        System.out.println(str);
    }
}
