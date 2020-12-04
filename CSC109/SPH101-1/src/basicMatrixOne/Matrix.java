package basicMatrixOne;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Matrix {

    public static void main(String[] args) {

        String numbers = "";
        Random rand = new Random();
        int rows = 0;
        
        while (rows < 1000){
            for (int index2 = 0; index2 < 100; index2++) {
                Integer storedNumber = rand.nextInt(10);
                numbers = numbers + storedNumber.toString();

                // System.out.println("working");
            }
            System.out.println(numbers);
            numbers = "";
            
            rows++;
            try {
                TimeUnit.MILLISECONDS.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
