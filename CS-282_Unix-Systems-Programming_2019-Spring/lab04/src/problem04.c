/*
 * problem04.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include <stdio.h>
#include "myflush.h"

void execute_problem04() {
	printf("START PROBLEM 4\n");

	int matrix[3][3];
	int sum = 0;
	printf("Enter the elements of 3x3 Matrix: \n");

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			scanf("%d", &matrix[i][j]);
		}
		clean_stdin();
	}


	// Print Rows + Row Sums
	for (int i = 0; i < 3; i++) {

		int count_row = 0;
		for (int j = 0; j < 3; j++) {
			count_row += matrix[i][j];
			printf("%d ", matrix[i][j]);
		}
		printf("%d \n", count_row);
	}

	// Count and print column sums
	for (int i = 0; i < 3; i++) {
		int count_col = 0;
		for (int j = 0; j < 3; j++) {
			count_col += matrix[j][i];
		}
		printf("%d ", count_col);
	}
}

