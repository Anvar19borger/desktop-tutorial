package homewoork;
//Задача 2. Бросьте кубик с 6-ю гранями 20 раз.
// Подсчитайте, сколько раз выпала каждая цифра.

import java.util.Random;

public class Cube {
    public static void main(String[] args) {

        int[] counts = new int[6]; //  Sosdaem massiv dlja 6 resultatov

        //  sosdal random dlja geniracii sluchainich chisel
      Random random = new Random();

        //Brosaem kubik i sapisivaem resultati v massiv
        for (int i = 0; i < 20; i++) {
            int roll = random.nextInt(6) + 1 ; // Geneeracija sluchainoga chisla ot 1 do 6
          counts[roll - 1]++; // Uvelichivaem schechik
        }

        // Vivodim resultat
        for (int i = 0; i < counts.length; i++) {
            System.out.println("Cifra " + (i + 1) + " vipala " + counts[i] + " ras");
        }

    }
}
