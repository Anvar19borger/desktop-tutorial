package practice.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence;// Pole classa tipa Seeentonse

    @BeforeEach
    void setUp() {
        sentence = new Sentence();//Visvoli pustoi konstrucktor po umolcha niju
    }

    @Test
    void countWordsTest() {
        String str = "One - two - three , four.";
        assertEquals(4, sentence.countWords(str));
    }

    @Test
    void countSymbolsTest() {
        String str = "  One? Two.  Three %";
        assertEquals(11,sentence.countSymbols(str) );

    }
}