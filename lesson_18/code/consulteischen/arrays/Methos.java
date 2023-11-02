package consulteischen.arrays;

public class Methos {
    // Pechat masiva
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void split() {
        System.out.println("====================================================");
    }

    // sapolnjaeet masiv  dlinnoi n  elimentov slucheinimi chislami v intervale ot a do b
    public static int[] fillArray(int n, int a, int b) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        return arr;// vosvraschaem massiv (obekt)

    }

    // ischim polojitelnuju, skolko ich v masive
    public static int positivNum(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // esli eliment mawsiva  > 0 to schetchik uvelichim
            if (arr[i] >= 0) {
                count++;

            }
        }
        return count;
    }

    // poisk indexa maksimalnogo  elimenta masiva
    public static int indexMaxEl(int[] arr) {
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            // esli naiddetsja  esche bolschii
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }

        }
        return indexMax;

    }

    // babeelsorte
    // public static int[] bubbleSort(int[] arr) {
    //   int tmp = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    //   if (arr[i] > arr[i + 1]) {
    //     int temp = arr[i];
    //   arr[i] = arr[i + 1];
    // arr[i + 1] = temp;
    //  }
    //}
    //  return arr;
    // }
    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {// u kajdogo err est vsegda svoja dlina
            for (int j = 0; j < arr.length - 1 - i; j++) {// pravi konec budit dwigatsja  k nachalu
                if (arr[j] > arr[j + 1]) {// esli levii is sasedei bolsche pravogo ,menjaen ich mestami
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }

            }
        }
        return arr;
    }
}
