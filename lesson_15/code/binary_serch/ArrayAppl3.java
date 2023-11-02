package binary_serch;

public class ArrayAppl3 {
    public static void main(String[] args) {

        int[] array = {-50, -10, 20, -100, 70, -10, 60, 40, 30, 50};

        ArrayMethods3.printArray(array);// napichatat
        ArrayMethods3.bubbleSort(array);// otsartirovat
        ArrayMethods3.printArray(array);// napichatat index iskomoga ellimenta
        ArrayMethods3.split();

        // вызываем binarySearch
        int index = ArrayMethods3.binarySearch(array, 20);
        System.out.println(index);
         index = ArrayMethods3.binarySearch(array, 60);
        System.out.println(index);

        int count = ArrayMethods3.searchDuplicate(array, -10);
        System.out.println(" Tokich dublikatov v masive: " + count);

    }
}
