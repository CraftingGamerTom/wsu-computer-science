package InClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author HaoLoi
 */
public class SpellNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter three digits:");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        int digit = value % 10;
        int t = value / 10; 
        int tenth = t % 10;
        int hun = value / 100;

        String digitw = "";

        switch (digit) {
            case 0:
                digitw = "zero";
                break;
            case 1:
                digitw = "one";
                break;
            case 2:
                digitw = "two";
                break;
            case 3:
                digitw = "three";
                break;
            case 4:
                digitw = "four";
                break;
            case 5:
                digitw = "five";
                break;
            case 6:
                digitw = "six";
                break;
            case 7:
                digitw = "seven";
                break;
            case 8:
                digitw = "eight";
                break;
            case 9:
                digitw = "nine";
        }

        String tenthw = "";
        switch (tenth) {
            case 0:
                tenthw = "";
                break;
            case 1:
                digitw = "";
                switch (digit) {
                    case 0:
                        tenthw = "ten";
                        break;
                    case 1:
                        tenthw = "eleven";
                        break;
                    case 2:
                        tenthw = "twelve";
                        break;
                    case 3:
                        tenthw = "thirteen";
                        break;
                    case 4:
                        tenthw = "fourteen";
                        break;
                    case 5:
                        tenthw = "fifteen";
                        break;
                    case 6:
                        tenthw = "sixteen";
                        break;
                    case 7:
                        tenthw = "seventeen";
                        break;
                    case 8:
                        tenthw = "eighteen";
                        break;
                    case 9:
                        tenthw = "nineteen";
                }
                break;

            case 2:
                tenthw = "twenty";
                break;
            case 3:
                tenthw = "thirty";
                break;
            case 4:
                tenthw = "forty";
                break;
            case 5:
                tenthw = "fifty";
                break;
            case 6:
                tenthw = "sixty";
                break;
            case 7:
                tenthw = "seventy";
                break;
            case 8:
                tenthw = "eighty";
                break;
            case 9:
                tenthw = "ninety";
        }

        String hunw = "";

        switch (hun) {

            case 1:
                hunw = "one hundred";
                break;
            case 2:
                hunw = "two hundred";
                break;
            case 3:
                hunw = "three hundred";
                break;
            case 4:
                hunw = "four hundred";
                break;
            case 5:
                hunw = "five hundred";
                break;
            case 6:
                hunw = "six hundred";
                break;
            case 7:
                hunw = "seven hundred";
                break;
            case 8:
                hunw = "eight hundred";
                break;
            case 9:
                hunw = "nine hundred ";
        }

        System.out.println("digit:" + hunw + " " + tenthw + " " + digitw);

    }

}