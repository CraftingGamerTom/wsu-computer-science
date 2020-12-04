package TestChapter67;

/*
Your task is to open a file, read all words in the file, and find the longest word in the file. If there are multiple words with the same length, return the first of the maximum length words.
Complete the following code:
	*/
	
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileAnalyzer
{
   /**
      @param inputFileName the name of the input file
   */
   public static String longestWord(String inputFileName)
      throws FileNotFoundException 
   {
	   File fileName = new File(inputFileName);
	   Scanner input = new Scanner (fileName);
	   String largest = "";
	   
	   while (input.hasNext()){
		   
		   String next = input.next();
		   
		   if (next.length() > largest.length()){
			   largest = next;
		   }
	   }
	   input.close();
	   return largest;
   }
}