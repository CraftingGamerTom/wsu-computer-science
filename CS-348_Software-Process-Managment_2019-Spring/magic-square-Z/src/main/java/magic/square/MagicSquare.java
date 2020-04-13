import java.util.ArrayList;

/**
 * Provides a method to determine if an array is a Magic Square.
 * 
 * @author Karl R. Wurst
 * @version Modified for CS 348 Spring 2019
 */
public class MagicSquare
{
    /**
     * Determines if an array is a Magic Square.
     * 
     * @param square a two-dimensional array of ints
     * @return true if the array is a Magic Square
     */
    public static boolean isMagicSquare(int[][] square) {

        if (!isSquare(square) || !containsAllNumbers(square)) {
            return false;
        }
        
        int sum = diagonal1Sum(square);
        if (sum != diagonal2Sum(square)) {
            return false;
        }
        
        if (sum != rowSums(square)) {
            return false;
        }

        if (sum != colSums(square)) {
            return false;
        }
        
        return true;
    }
    
    /**
     * Get the sum of the first diagonal
     * (upper-left to lower-right)
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the diagonal
     */
    public static int diagonal1Sum(int[][] square) {
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            sum = sum + square[row][row];
        }
        return sum;
    }
    
    /**
     * Get the sum of the second diagonal
     * (upper-right to lower-left)
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the diagonal
     */
    public static int diagonal2Sum(int[][] square) {
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            sum = sum + square[row][square.length - row - 1];
        }
        return sum;
    }
    
    /**
     * Get the sum of each row, if they are all the same
     * 
     * @param square a square, two-dimensional array of ints
     * @return -1 if the sums don't match, sum of the first row otherwise
     */
    public static int rowSums(int[][] square) {
        int firstRowSum = rowSum(square, 0);
        for (int row = 1; row < square.length; row++) {
            if (rowSum(square, row) != firstRowSum) {
                return -1;
            }
        }
        return firstRowSum;
    }

    /**
     * Get the sum of each col, if they are all the same
     * 
     * @param square a square, two-dimensional array of ints
     * @return -1 if the sums don't match, sum of the first ol otherwise
     */
    public static int colSums(int[][] square) {
        int firstColSum = colSum(square, 0);
        for (int col = 1; col < square.length; col++) {
            if (colSum(square, col) != firstColSum) {
                return -1;
            }
        }
        return firstColSum;
    }
        
    /**
     * Get the sum of a given row
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the given row
     */
    public static int rowSum(int[][] square, int row) {
        int sum = 0;
        for (int col = 0; col < square.length; col++) {
            sum = sum + square[row][col];
        }
        return sum;
    }

    /**
     * Get the sum of a given column
     * 
     * @param square a square, two-dimensional array of ints
     * @return sum of the numbers in the given column
     */
    public static int colSum(int[][] square, int col) {
        int sum = 0;
        for (int row = 0; row < square.length; row++) {
            sum = sum + square[row][col];
        }
        return sum;
    }
    
    /**
     * Determines if an array is a square.
     * 
     * @param square a two-dimensional array of ints
     * @return true if the array is a square (all rows and cols are same length, and not zero length)
     */
    public static boolean isSquare(int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }
        
        boolean square = true;
        for (int col = 0; col < rows; col++) {
            if (array[col].length != rows) {
                square = false;
            }
        }
        return square;
    }
    
    /**
     * Determines if the array contain all numbers from 1 to n*n,
     * where n is the length of the sides
     * 
     * @param square a square, two-dimensional array of ints
     * @return true if the array contain all numbers from 1 to n*n
     */
    public static boolean containsAllNumbers(int[][] square) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numList.add(square[row][col]);
            }
        }
        
        boolean all = true;
        for (int num = 1; num <= square.length * square.length; num++) {
            if (numList.indexOf(num) == -1) {
                return false;
            }
        }
        return true;
    }
}
