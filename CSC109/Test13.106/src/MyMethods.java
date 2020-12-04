public class MyMethods {

    public static int reverseInt(int value) {
        // exit statement
        if (value <= 0) {
            return 0;
        }
        else {
            int onesPlace = value % 10;
            int allOtherNumbers = value / 10;
            int number = numberOfDigits(value);
            int remainingNumbers = (onesPlace * powerOfTen(number - 1));

            return remainingNumbers + reverseInt(allOtherNumbers);

        }
    }

    public static int powerOfTen(int exponent) {
        if (exponent <= 0) {
            return 1;
        }
        else {
            return 10 * powerOfTen(exponent - 1);
        }
    }

    public static int numberOfDigits(int value) {
        if (value < 10) {
            return 1;
        }
        else {
            return 1 + numberOfDigits(value / 10);
        }
    }
}
