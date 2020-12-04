package first;

/**
 * Computes a sum of odd integers between two bounds. Input: a, the lower bound
 * (may be odd or even). Input: b, the upper bound (may be odd or even). Output:
 * sum of odd integers between a and b (inclusive).
 */

import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		// Read values for a and b
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int bounds = a;
		int sum = 0;
		in.close();

		while (bounds >= a && bounds <= b)
		{
			if (bounds % 2 == 1 || bounds % 2 == -1)
			{
				sum += bounds;
			}
			bounds++;
		}
		System.out.println(sum);

	}
}
