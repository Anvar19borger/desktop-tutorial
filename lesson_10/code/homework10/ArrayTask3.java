package homework10;

//Task 3 (*)
//Given an array of integers: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38. Find the maximum array element and its index.

public class ArrayTask3 {
    public static void main(String[] args) {

        int[] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

        int maxElement = numbers[0]; // Pervii element , nachalnii maximum.
        int maxElementIndex = 0; //  Index nachalnogo maximalnogo  elementa.

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                maxElementIndex = i;
            }
        }
        // Resultat.
        System.out.println("Maximum element : " + maxElement);
        System.out.println("Inddex of the maximum element : " + maxElementIndex);
    }
}





