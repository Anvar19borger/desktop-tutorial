package homework;

import java.util.ArrayList;
import java.util.Comparator;

public class PlanetAppl {
    public static void main(String[] args) {
        // Создание объектов планет с указанием характеристик
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 0.39, 3.285E23, 0));
        planets.add(new Planet("Venus", 0.72, 4.867E24, 0));
        planets.add(new Planet("Earth", 1.0, 5.972E24, 1));
        planets.add(new Planet("Mars", 1.52, 6.39E23, 2));
        planets.add(new Planet("Jupiter", 5.2, 1.898E27, 79));
        planets.add(new Planet("Saturn", 9.58, 5.683E26, 82));
        planets.add(new Planet("Uranus", 19.22, 8.681E25, 27));
        planets.add(new Planet("Neptune", 30.05, 1.024E26, 14));

        // Сортировка списка планет по порядку расположения в солнечной системе
        planets.sort(Comparator.comparingDouble(Planet::getDistanceFromSun));

        System.out.println("Планеты отсортированные по порядку расположения в солнечной системе:");
        for (Planet planet : planets) {
            System.out.println(planet.getName());
        }

        // Сортировка списка планет по алфавиту
        planets.sort(Comparator.comparing(Planet::getName));

        System.out.println("\nПланеты отсортированные по алфавиту:");
        for (Planet planet : planets) {
            System.out.println(planet.getName());
        }

        // Сортировка списка планет по массе
        planets.sort(Comparator.comparingDouble(Planet::getMass));

        System.out.println("\nПланеты отсортированные по массе:");
        for (Planet planet : planets) {
            System.out.println(planet.getName());
        }

        // Сортировка списка планет по количеству спутников
        planets.sort(Comparator.comparingInt(Planet::getNumberOfMoons));

        System.out.println("\nПланеты отсортированные по количеству спутников:");
        for (Planet planet : planets) {
            System.out.println(planet.getName());
        }
    }
}


