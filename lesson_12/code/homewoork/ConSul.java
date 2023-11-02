package homewoork;

public class ConSul {
    public static void main(String[] args) {
         // Напишите программу, которая удаляет из массива элемент по условиям:
        //по заданной позиции.
       //по значению
        // или так int[] source = { 1,2,6,9,-5};
        int[] source = new int[5];
        source[0] = 22; // так как массив стартует с 0
        source[1] = 12;
        source[2] = 1441414;
        source[3] = 914141311;
        source[4] = -51414141; // длина массива -1


        //source[1] = x;

        int x = source[1]; // значение по индексу [1], это 2-ой элемент в массиве = 2

        printMassive(source);
        /*dellByPosition(source,2);
        printMassive(source);*/
        dellByElement(source, 1441414);
        printMassive(source);
    }

    public static void printMassive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void dellByPosition(int[] abc, int position) {
        //abc[position] = 0; - можно и без этой позиции
        for (int i = 0; i < abc.length; i++) {
            if (i == position) {
                abc[i] = 0;
            }
        }
    }

    public static void dellByElement(int[] abc, int element) {
        //abc[position] = 0; - можно и без этой позиции
        for (int i = 0; i < abc.length; i++) {
            if (abc[i] == element) {
                abc[i] = 0;
            }
        }
    }
}





