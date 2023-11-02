package practice.employee_firma.model;

public abstract class Employee {// Employee eto angeschtelte sotrudnik
    // Polja klassa
    protected final int id;
    protected String firstName;
    protected String lastName;
    protected int ege;
    protected double hours;

    //Konstruktor


    public Employee(int id, String firstName, String lastName, int ege, double hours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ege = ege;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employee employee = (Employee) object;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Employee ");
        sb.append("id = ").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", hours=").append(hours);
        sb.append(", salary=").append(calcSalary());
        return sb.toString();

    }
    public abstract  double calcSalary();//opredilili obstraknii mmetod, u nego nt tela
}
