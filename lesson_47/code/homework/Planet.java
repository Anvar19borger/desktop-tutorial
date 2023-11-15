package homework;

//Задача 2. Занести планеты солнечной системы в список, содержащий:
//
//наименование;
//расстояние до Солнца;
//массу;
//количество спутников.
//Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.

public class Planet {
    private String name;
    private double distanceFromSun;
    private double mass;
    private int numberOfMoons;

    public Planet(String name, double distanceFromSun, double mass, int numberOfMoons) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }


    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public double getMass() {
        return mass;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                ", mass=" + mass +
                ", numberOfMoons=" + numberOfMoons +
                '}';
    }
}


