package practice.perfonce_test;

import java.util.*;

public class PerformanceTestAppl {

    // opredilim constanti
    private  static final int N_NUBERS = 1_000_000;
    private static final  int MIN = 10;
    private static final  int MAX = 100;
    private  static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        fillList(list);// sapolnit list metodom

        System.out.println("--------- ffor each-------------");
        long t1 = System.currentTimeMillis();// sasekli vremja
        int sum =0;
        // slojim vse elimenti lista
     for (Integer n : list){
         sum += n;
     }
     long t2  = System.currentTimeMillis();
        System.out.println("Sum = " + sum);
        System.out.println("Prodoljitelnost lista " + (t2 - t1));
        System.out.println("---------------iteerator - obchod lista-----------------------------");
        t1 = System.currentTimeMillis();//sasekli vremja
        sum =0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        t2 = System.currentTimeMillis();// sasekli vreja
        System.out.println("Duration of iteration: " + (t2 -t1));

        System.out.println("------------------for loop--------------------------");
        t1 = System.currentTimeMillis();// sasekli vremja
        sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum+= list.get(i);
        }
        t2 = System.currentTimeMillis();
        System.out.println("Duration  of  iteration " + (t2 - t1));


    }

    private static void fillList(List<Integer> list) {
        long t1 = System.currentTimeMillis();// sasekli vremja
        for (int i = 0; i < N_NUBERS; i++) {
            list.add(MIN + random.nextInt(MAX - MIN));
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Prodoljitelnost lista " + (t2 - t1));
    }
}
