package practice;

import java.util.ArrayList;
import java.util.List;

public class ToDoListImpl implements  ToDoList{
    private List<Task> tasks = new ArrayList<>();
    private int taskIdCounter = 1;

    @Override
    public void addTask(String task) {
        Task newTask = new Task(taskIdCounter, task, tasks.size() + 1);
        tasks.add(newTask);
        taskIdCounter++;
    }

    @Override
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    @Override
    public void deleteTask(int taskNumber) {
        tasks.removeIf(task -> task.getTaskNumber() == taskNumber);
    }
}
