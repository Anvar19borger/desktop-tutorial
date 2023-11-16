package homework_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedList {    public static void main(String[] args) {
    List<String> originalList = Arrays.asList("Джэк", "Джон", "Ник");

    LinkedList<String> reversedLinkedList = convertToReversedLinkedList(originalList);

    System.out.println("Исходный List: " + originalList);
    System.out.println("LinkedList в обратном порядке: " + reversedLinkedList);
}

    public static LinkedList<String> convertToReversedLinkedList(List<String> originalList) {
        LinkedList<String> reversedLinkedList = new LinkedList<>(originalList);
        Collections.reverse(reversedLinkedList);
        return reversedLinkedList;
    }

}
