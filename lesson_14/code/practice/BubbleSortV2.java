package practice;

public class BubbleSortV2 {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {// u kajdogo err est vsegda svoja dlina
            for (int j = 0; j < arr.length - 1 - i; j++) {// pravi konec budit dwigatsja  k nachalu
                if (arr[j] > arr[j + 1]) {// esli levii is sasedei bolsche pravogo ,menjaen ich mestami
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }

            }
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
