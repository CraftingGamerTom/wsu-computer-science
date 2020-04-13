/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"
// use clean_stdin();

#include<stdio.h>
void print_totals(int (*)[], int*, int*); //Function Declaration

void execute_problem02() {
	int row, col;
	int matrix[10][10];
	printf(" \nEnter no. of rows: ");
	scanf("%d", &row);
	clean_stdin();
	printf(" \nEnter no. of cols: ");
	scanf("%d", &col);
	clean_stdin();
	printf("Enter the elements of %dx%d Matrix: \n", row, col);
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			scanf("%d", &matrix[i][j]);
		}
		clean_stdin();
	}
	print_totals(matrix, &row, &col);
}

//Function with Call By Reference Parameters
void print_totals(int (*arr)[10], int *row, int *col) {
	int row_tot, col_tot;
	printf("Elements with Row Totals and Column Totals are: \n");
	for (int i = 0; i < *row; i++) {
		row_tot = 0;
		for (int j = 0; j < *col; j++) {
			//row_tot+=arr[i][j]; // With Indices
			row_tot += *(*(arr + i) + j); // With Pointer Notation
			//printf("%d \t",arr[i][j]); // With Indices
			printf("%d \t", *(*(arr + i) + j)); // With Pointer Notation
		}
		printf("%d \t\n", row_tot);
	}
	for (int j = 0; j < *col; j++) {
		col_tot = 0;
		for (int i = 0; i < *row; i++) {
			//col_tot+=arr[i][j];
			// With Indices
			col_tot += *(*(arr + i) + j); // With Pointer Notation
		}
		printf("%d \t", col_tot);
	}
	printf(" \n");
}
