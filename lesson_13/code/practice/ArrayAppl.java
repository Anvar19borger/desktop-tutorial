package practice;

public class ArrayAppl {
    public static void main(String[] args) {

        int[] number = {8, 9, 12, 65, 98, 3, 57, 4, 1, 22,};
        ArrayMethods.printArray(number);
        int max = ArrayMethods.maxArray(number);
        System.out.println("Maximum = " + max);
        int maxIndex = ArrayMethods.maxArrayIndex(number);
        System.out.println("Index maximalnogo elementa: " + maxIndex);
        ArrayMethods.sortArray(number);// vipolnjaem sortirovku
        ArrayMethods.printArray(number);// pechataem posli sortirovki
        ArrayMethods.split();

        int min = ArrayMethods.minArray(number);
        System.out.println("Minemum = " + min);
        System.out.println("==================");
        int minIndex = ArrayMethods.minArrayIndex(number);
        System.out.println("Index minemalnogo elementa: " + minIndex);
        ArrayMethods.sortArray(number);// vipolnjaem sortirovku
        ArrayMethods.printArray(number);// pechataem posli sortirovki
        ArrayMethods.split();



        int[] number2 = {-5, 56, -100, 0, 15, 52, 67, 8, 1};
        ArrayMethods.printArray(number2);
        int max2 = ArrayMethods.maxArray(number2);
        System.out.println("Maximum = " + max2);
        int maxIndex2 = ArrayMethods.maxArrayIndex(number2);
        System.out.println("Index maximalnogo elementa: " + maxIndex2);
        ArrayMethods.sortArray(number2);// vipolnjaem sortirovku
        ArrayMethods.printArray(number2);// pechataem posli sortirovki
        ArrayMethods.split();


        String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        ArrayMethods.printArray(digits);


    }
}
