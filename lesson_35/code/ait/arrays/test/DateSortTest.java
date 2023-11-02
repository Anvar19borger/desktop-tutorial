package ait.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class DateSortTest {
    Comparator<String> comparator;
    @BeforeEach
    void setUp(){
        comparator = (s1,s2) ->{
            //TODO Homework.Don't use Java Time
            return 0;
        };
    }
    @Test
    void  testDateSort(){
        String[] dates = {
                ""
        };
        String[] expected = {
                ""
        };
    }

}
