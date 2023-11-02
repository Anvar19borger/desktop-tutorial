package practice;

class Task implements Comparable<Task> {
    private int id;
    private String task;
    private int taskNumber;

    public Task(int id, String task, int taskNumber) {
        this.id = id;
        this.task = task;
        this.taskNumber = taskNumber;
    }

    // Getters and setters


    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                ", taskNumber=" + taskNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task1 = (Task) o;
        return id == task1.id;
    }

    @Override
    public int hashCode() {
        return  id;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.taskNumber, other.taskNumber);
    }


    public int getTaskNumber() {
        return 0;
    }
}

