package HomeworkSeven;

/**
Reads a file of exam scores and calculates the average score.
*/

import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;

public class ExamAverage {

	public static void main(String[] args) throws FileNotFoundException {
		String inputFileName = "scores.txt";
		String outputFileName = "examScoreAverage.txt";
		
		Scanner input = new Scanner(new File(inputFileName));
		PrintWriter output = new PrintWriter(outputFileName);
		
		ArrayList<Double> numbers = new ArrayList<>();
		double total = 0;
		
		while (input.hasNext()){
			double temp = Double.parseDouble(input.next());
			numbers.add(temp);
		}
		for(int i = 0; i < numbers.size(); i++){
			output.println("Score " + (i+1) + ": " + numbers.get(i)); //Lists scores
			total += numbers.get(i); //Adds up all numbers given
		}
		output.println("Number of scores read: " + numbers.size()); //Prints how many scores were read
		output.println("Average Score: " + (total/numbers.size())); //Prints the average score

		input.close();
		output.close();

		// TODO: Open the input and output files.
		// Read records from the input file.
		// Calculate the average score.
		// Write each exam score, the count of scores read,
		// and the average score to the output file.
	}
}