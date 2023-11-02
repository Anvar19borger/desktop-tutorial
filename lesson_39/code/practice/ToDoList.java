package practice;

import java.util.List;

public interface ToDoList {
    void addTask(String task);

    List<Task> getAllTasks();

    void deleteTask(int taskNumber);
}
