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
public class SpellNumbersLeft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter three digits:");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        String allNumbers = spellNumber(value, 0);
        System.out.println("digit:" + allNumbers);
        
        in.close();
    }

    public static String spellNumber(int value, int counter) {
        
        // int counter = 0;
        
        if (value <= 0)
        {            
            return "";
        }
        String allNumbers = "";
        String allStrings = spellNumber(value/1000, counter+1);
        
            int tmpval = value % 1000;
            
            int digit = tmpval % 10;
            int t = tmpval / 10;
            int tenth = t % 10;
            int hun = tmpval / 100;
            
            String digitw="";  // spell ones place
            if (tenth != 1)
            {
                digitw = digits(digit);
            }
            String tenthw = tenths(tenth, digit);  // spell tens place
            String hunw = hundred(hun);  // spell hundred place
            
            String thouPlace = thousand(counter);  // spell thousand place
            

            allNumbers = hunw + " " + tenthw + " " +  digitw + " " + thouPlace + " ";
        
            return allStrings + allNumbers;

    }

    public static String thousand(int counter) {
        String thouPlace = "";
        switch (counter)
        {
            case 0:
                break;
            case 1: thouPlace = "thousand";
            break;
            case 2: thouPlace = "million";
            break;
            case 3: thouPlace = "billion";
            break;
            default:
                thouPlace = "Error";
                
        }
        return thouPlace;
    }

    public static String hundred(int hun) {
        
        if (hun > 0)
        {
             return digits(hun) + " hundred";
        }
        
        return "";
    }

    public static String digits(int digit) {
        String digitw = "";
        switch (digit) {
            case 0:
                digitw = "";
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
        return digitw;
    }

    public static String tenths(int tenth, int digit)
    {
        String tenthw = "";
        switch (tenth) {
            case 0:
                tenthw = "";
                break;
            case 1:
                String digitw = "";
                tenthw = teens(digit, tenthw);
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
        
        return tenthw;
        
        
        
    }

    public static String teens(int digit, String tenthw) {
        
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
        return tenthw;
    }
    
    
    
    
}