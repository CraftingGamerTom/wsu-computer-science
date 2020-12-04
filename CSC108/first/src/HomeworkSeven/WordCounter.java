package HomeworkSeven;

/*
Your task is to write a file that reads a text file, line by line, and writes another file containing each line of the input, preceded by number of the number of words in that line. There should be three spaces between the number and the start of the text line.

For example, consider the input file Peter.txt, containing the following text:

Peter Piper picked a peck of pickled peppers.
A peck of pickled peppers, Peter Piper picked.
If Peter picked a peck of pickled peppers,
Where's the peck of pickled peppers Peter Piper picked?
The output from this program would appear as the following:

8   Peter Piper picked a peck of pickled peppers.
8   A peck of pickled peppers, Peter Piper picked.
8   If Peter picked a peck of pickled peppers,
9   Where's the peck of pickled peppers Peter Piper picked?
Complete the following code:
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads a text file, line by line, counts the number of words per line, prints
 * out each line of the poem, preceded by number of the number of words in that
 * line.
 */
public class WordCounter {
	public static void main(String[] args) throws FileNotFoundException {
		// Set up the input and output file names
		String inputFileName = "JackJill.txt";
		String outputFileName = "output.txt";

		String line = "";

		File inputFile = new File(inputFileName);
		PrintWriter output = new PrintWriter(outputFileName);

		// Construct the Scanner and PrintWriter objects
		Scanner in = new Scanner(inputFile);

		while (in.hasNextLine()) {
			line = in.nextLine();

			int count = 1;
			if (line.length() == 0){
				output.println("0   " + line);
			}else{
				for (int index = 0; index < line.length(); index++) {
					
					if (line.charAt(index) == ' ') {
						count++;
					}	
				}
				output.println(count + "   " + line);
			}

		}

		in.close();
		output.close();
	}
}