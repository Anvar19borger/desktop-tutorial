package homework15;
//Task 2. Create an array of 20 random integers from the range from -100 to 100. Sort the resulting array.
// Is the number 0 included in this array? (find out using binary search)
// If so, what place (index) in the array? If not, what index should it be placed at?

public class ArrayApplHw {

    public static void main(String[] args) {

        int[] array = ArrayMethHw.createAndFillArray(20, -100, 100);
        ArrayMethHw.printArray(array);
        ArrayMethHw.bubbleSort(array);
        ArrayMethHw.printArray(array);
        int number = ArrayMethHw.binarySearch(array, 0);
        if (number >= 0) {
            System.out.println("The number 0 is included in the array and is located under : " + number + " index ");
        } else {
            System.out.println("The number 0 was not included in the array, but if it had been, it would have been under: "
                    + (-number - 1) + " index ");
        }

    }

}
