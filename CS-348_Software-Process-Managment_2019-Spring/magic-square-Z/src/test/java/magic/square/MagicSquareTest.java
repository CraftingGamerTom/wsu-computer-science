import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The test class MagicSquareTest.
 *
 * @author  Karl R. Wurst
 * @version Modified for CS 348 Spring 2019
 */
public class MagicSquareTest
{
    int[][] square4x4Magic = {{16, 3, 2,13},
                           { 5,10,11, 8},
                           { 9, 6, 7,12},
                           { 4,15,14, 1}};
    int[][] square4x4NotMagic = {{16, 2, 3,13},
                              { 5,10,11, 8},
                              { 9, 6, 7,12},
                              { 4,15,14, 1}};
    int[][] square4x4NotAllNums = {{16, 3, 3,13},
                                { 5,10,11, 8},
                                { 9, 6, 7,12},
                                { 4,15,14, 1}};
    int[][] square1x1Magic = {{1}};
    int[][] notSquare0x0 = new int[0][0];
    int[][] notSquare1x2 = {{1,2}};
    int[][] ragged = {{1,2,3},
                      {4,5,6},
                      {7,8,9,10}};

    @Test
    public void testIsSquare() {
        assertTrue(MagicSquare.isSquare(square1x1Magic));
        assertTrue(MagicSquare.isSquare(square4x4Magic));
        assertTrue(MagicSquare.isSquare(square4x4NotMagic));
        assertTrue(MagicSquare.isSquare(square4x4NotAllNums));
        assertFalse(MagicSquare.isSquare(notSquare1x2));
        assertFalse(MagicSquare.isSquare(notSquare0x0));
        assertFalse(MagicSquare.isSquare(ragged));
    }

    @Test
    public void testContainsAllNums() {
        assertTrue(MagicSquare.containsAllNumbers(square4x4Magic));
        assertTrue(MagicSquare.containsAllNumbers(square4x4NotMagic));
        assertFalse(MagicSquare.containsAllNumbers(square4x4NotAllNums));
    }   
    
    @Test
    public void testIsMagicSquare() {
        assertTrue(MagicSquare.isMagicSquare(square4x4Magic));
        assertFalse(MagicSquare.isMagicSquare(square4x4NotAllNums));
        assertFalse(MagicSquare.isMagicSquare(square4x4NotMagic));
    }   
}
