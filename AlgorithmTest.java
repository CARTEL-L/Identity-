package lcm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {

    @Test
    public void testSortedSquaresWorks(){
        Algorithm algo = new Algorithm();
        int[] num = {3,2,7,1,4};
        int[] expected = {1,4,9,16,49};
        assertArrayEquals(expected, algo.sortedSquares(num));
    }

    @Test
    public void testShortedSentenceWordReturnsTheShortestWord(){
        Algorithm algo = new Algorithm();
        String sentence = "Hello my good men ohf the cartel";
        assertEquals("my", algo.shortedSentenceWord(sentence));
    }
}
