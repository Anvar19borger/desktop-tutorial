package consulteischen.arrays;

import java.util.Arrays;

// создать массив на 20 элементов, случайные целые числа от -50 до 30
// сколько положительных? отрицательных?
// сколько четных? сколько нечетных
// максимальное? минимальное число?
// сортировка
// есть ли заданное число? - найти его индекс
public class ArrayAppl {
    public static void main(String[] args) {


        int[] numbers = Methos.fillArray(20, -50, 30);
        Methos.printArray(numbers);

        int num = Methos.positivNum(numbers);
        System.out.println();
        System.out.println("Positiv num : " + num);
        int indexMax = Methos.indexMaxEl(numbers);
        System.out.println(" Index of max eelement = " + indexMax);
        System.out.println(" Max eleement = " + numbers[indexMax]);
        Methos.bubbleSort(numbers);// sorteruem
        System.out.println(Arrays.toString(numbers));//peechataem masiv


    }
}
