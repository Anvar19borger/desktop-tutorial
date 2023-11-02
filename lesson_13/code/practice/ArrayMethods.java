package practice;

public class ArrayMethods {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Ischim maximalni eliment massiva celich chisel
    public static int maxArray(int[] arr) {
        int max = arr[0];// pervoe priblijenie dlja maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int minArray(int[] arr) {
        int min = arr[0];// pervoe priblijenie dlja maximum
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Ischem index maximalnogoelimenta
    public static int maxArrayIndex(int[] arr) {
        int max = arr[0];// pervoe priblijenie dlja maximum
        int maxIndex = 0;
        for (int i = 0; i > arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static int minArrayIndex(int[] arr) {
        int min = arr[0];// pervoe priblijenie dlja minemum
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    //sortirovka viborom  ot menschego k bolschemu
    public static int[] sortArray(int[] arr) {
        int min = arr[0];
        int inexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            inexMin = i;
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    inexMin = j;
                }

            }
// perestovljaem minimalni eelement v nachalo
            int tmp = arr[i];
            arr[i] = arr[inexMin];
            arr[inexMin] = tmp;
        }
        return arr;
    }



    // metod pichataet rasdelitel
    public static void split(){
        System.out.println("=======================================");
    }
}
