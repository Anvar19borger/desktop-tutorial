package ait.wardrobe.test;

import ait.wardrobe.model.Wardrobe;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static sun.nio.cs.Surrogate.MAX;

class WardrobeTest {
    Wardrobe[] wardrobes;
    private static final  int SIZE =10;
    private static final  int MAX = 5;

    static Random random = new Random();

    @BeforeEach
    void setUp() {
        wardrobes = new Wardrobe[SIZE];
        for (int i = 0; i < wardrobes.length; i++) {
            double height = random.nextInt(MAX);


        }


    }
}