package homework.array;

import java.util.ArrayList;

public class AlphabetArrayList {
    public static void main(String[] args) {
        // Sosdaem obekt  ArrayList dlja hranenija sinvolov
        ArrayList<Character> alphabetList = new ArrayList<>();

        // Sapolnil ArrayList sinvolami  ot A do Z
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabetList.add(ch);
        }

        // Vivoju sinvali ArrayList
        System.out.println("Latinski alfavit ArrayList: " + alphabetList);
    }
}
