package practice;

import java.util.List;
import java.util.Scanner;

public class ToDoAppl {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList() {
            @Override
            public void addTask(String task) {

            }

            @Override
            public List<Task> getAllTasks() {
                return null;
            }

            @Override
            public void deleteTask(int taskNumber) {

            }
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Dobro pojalivat v prilojenie 'Spisok del'!");

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Ispolsivat sinvol novoi stroki

            switch (choice) {
                case 1:
                    System.out.print("Vvedite novuju sadachu: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    System.out.println("Sadacha dobavlina.");
                    break;
                case 2:
                    List<Task> tasks = toDoList.getAllTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("Spisok sadach pust.");
                    } else {
                        System.out.println("Vse sadachi:");
                        for (Task t : tasks) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Vvedite nomer sadachi dlja udalenija: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.deleteTask(taskNumber);
                    System.out.println("Sadacha udalena.");
                    break;
                case 4:
                    System.out.println("Do svidanija!");
                    System.exit(0);
                default:
                    System.out.println(" Nekorrektnii vibor . Poprobuite snova.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Menu:");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option.getValue() + ". " + option.getDescription());
        }
        System.out.print("Viberite deistvie: ");
    }
}


