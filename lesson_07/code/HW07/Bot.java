package HW07;

import java.util.Scanner;

//Задача 2. Написать бот, который задет не менее 3-х вопросов (последовательно),
// принимает ответы от пользователя и реагирует на эти ответы.
// Пример:Как вас зовут ? Очень приятно, меня зовут Бот1.
// Какой у вас вес? 106 кг. А какой рост? А какой возраст? ... Варианты ответов..., которые отвечает бот.
public class Bot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kak vasche imja ?");
        String name = scanner.next();
        System.out.println("Rad was widet " + name + ". Skoolko wam let? ");
        int age = scanner.nextInt();
        System.out.println("Chem wi sanimaetes? ");
        String study = scanner.next();
        System.out.println("A gde? ");
        String schule = scanner.next();
        System.out.println("Rad snakomstwu.");




    }
}
