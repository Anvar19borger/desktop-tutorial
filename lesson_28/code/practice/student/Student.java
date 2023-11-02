package practice.student;

public class Student {
    // polja
    private int id;
    private String firstName;
    private String secondName;
    private int[] marks;

    public Student(int id, String firstName, String secondName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.marks = marks;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    // metod kotori schitaet srednii bal studenta
    public double averageMark(int[]marks){
        //slojit vse otcenki
        int sum = 0;// perimennaja dlja nakopleenija summi
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];// nakaplivaeem summu balov , otcenok

        }

        //rasdelit na ich kolicheestvo
        return sum/(double)marks.length;
    }


}
