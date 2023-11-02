package practice;

public class Appl {
    public static void main(String[] args) {

        int[] array = {-12, 5, 36, 28, -16, 100, 82, 64, 57, 5};

        BubbleSortV2.printArray(array);// pechat do sortirovki
        BubbleSortV2.bubbleSort(array);// delaem sortirovku
        BubbleSortV2.printArray(array);// pechat posli sortirovki

    }
}
