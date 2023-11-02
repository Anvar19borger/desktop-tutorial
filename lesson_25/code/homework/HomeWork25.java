package homework;

//Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
// Выполнить практикум с этой строкой:
//
//Распечатать последний символ строки.
//Найти позицию подстроки “Java” в строке.
//Проверить, содержит ли заданная строка подстроку “Java”.
//Заменить все символы “o” на “a”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.
//Вырезать подстроку Java c помощью метода substring().
//Проверить, заканчивается ли строка подстрокой “!!!”.
//Проверить, начинается ли строка подстрокой “I'm proud”.
public class HomeWork25 {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        // Распечатать последний символ строки.
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Last character of the line: " + lastChar);

        System.out.println("----");

        // Найти позицию подстроки "Java" в строке.
        int position = str.indexOf("Java");
        System.out.println("Position substrings 'Java': " + position);

        System.out.println("----");

        // Проверить, содержит ли заданная строка подстроку "Java".
        boolean containsJava = str.contains("Java");
        System.out.println("The line contains 'Java': " + containsJava);

        System.out.println("----");

        // Заменить все символы "o" на "a".
        String replacedString = str.replace("o", "a");
        System.out.println("String after replacement 'o' на 'a': " + replacedString);

        System.out.println("----");

        // Преобразуйте строку к верхнему регистру.
        String uppercaseString = str.toUpperCase();
        System.out.println("Uppercase string: " + uppercaseString);

        System.out.println("----");

        // Преобразуйте строку к нижнему регистру.
        String lowercaseString = str.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        System.out.println("----");

        // Вырезать подстроку "Java" с помощью метода substring().
        String substring = str.substring(16, 20);
        System.out.println("Removed substring: " + substring);

        System.out.println("----");

        // Проверить, заканчивается ли строка подстрокой "!!!".
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("The line ends with '!!!': " + endsWithExclamation);

        System.out.println("----");

        // Проверить, начинается ли строка подстрокой "I'm proud".
        boolean startsWithProud = str.startsWith("I'm proud");
        System.out.println("The line starts with 'I'm proud': " + startsWithProud);
    }


}
