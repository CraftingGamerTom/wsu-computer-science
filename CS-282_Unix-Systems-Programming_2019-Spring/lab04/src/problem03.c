/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

// Program to write:
// 3 4 5
// 2 3 4
// 1 2 3
// Should print 1, 4, 9, 8, 5 (Add diagonally)
#include<stdio.h>
#include "myflush.h"

void execute_problem03() {
	printf("START PROBLEM 3\n");

	int matrix[3][3];
	int sum = 0;
	printf("Enter the elements of 3x3 Matrix: \n");

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			scanf("%d", &matrix[i][j]);
		}
		clean_stdin();
	}

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (i == j) {
				sum = sum + matrix[i][j];
			}
		}
	}
	printf("Sum of Diagonal Elements is: %d \n", sum);
}
