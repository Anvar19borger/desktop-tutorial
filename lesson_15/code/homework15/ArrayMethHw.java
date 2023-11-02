package homework15;


import java.util.Random;

public class ArrayMethHw {
    // We create an array of 'n' elements and fill it with random numbers from and to,
    //    which we pass when calling the method.
    public static int[] createAndFillArray(int length, int feelFrom, int feelTo) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (feelTo - feelFrom + 1) + feelFrom);
        }
        return arr;
    }

    // Separator Print
    public static void split() {
        System.out.println("=================");
    }

    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Method to print an integer array (int)
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    // Binary search for a number in an array
    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (num < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -left - 1;
    }

    // A method that returns a new array from the current array with only positive numbers.
    public static int[] arrayReturnPositiveNumber(int[] array) {
        int positiveNumberCount = 0;

        // probigaem po masivu i schitaem kolichestvo polojitelnich chisel
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveNumberCount++;//sdes podschitalos kolichestvo chisel > 0
            }
        }
        int[] arrayPositive = new int[positiveNumberCount];// obevljaem novii masiv s dlinnoi count
        int index = 0;


        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                arrayPositive[index] = array[j];
                index++;
            }
        }
        return arrayPositive;
    }

    // Method for exchanging the value of two variables of integer type without using a third variable.
    public static void swap(int a, int b) {
        a = a - b;
        b = a + b;
        a = -a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}






