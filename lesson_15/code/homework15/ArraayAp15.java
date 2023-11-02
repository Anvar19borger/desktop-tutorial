package homework15;
//Task 3. Create an array of 20 random integers from the range -100 to 100.
// Implement a method that takes the original array as input and returns an array
// containing only positive numbers from the original array.

public class ArraayAp15 {
    public static void main(String[] args) {
        int[] array = ArrayMethHw.createAndFillArray(20, -100, 100);
        ArrayMethHw.printArray(array);
        int[] arrayEven = ArrayMethHw.arrayReturnPositiveNumber(array);
        ArrayMethHw.printArray(arrayEven);
    }


}
