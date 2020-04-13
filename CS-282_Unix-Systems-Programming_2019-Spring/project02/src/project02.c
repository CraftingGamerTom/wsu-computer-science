/*
 ============================================================================
 Name        : project02.c
 Author      : Thomas Rokicki
 Version     : 1.0.0
 Copyright   : All Rights Reserved.
 Description : Program to Calculate Sales
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

// Mine
#include "logger.h"
#include "continueloop.h"

void run(void);

int main(void) {

	do {
		run();
	} while (userWishesToContinue());

	return EXIT_SUCCESS;
}

void run(void) {
	char debug_str[100];
	int num_of_emp, num_of_products;
	printf("Enter the number of salesmen: \n");
	scanf("%d", &num_of_emp);
	printf("Enter the number of products: \n");
	scanf("%d", &num_of_products);

	int matrix[num_of_products][num_of_emp];
	char names[num_of_emp][10];
	int sum = 0;

	printf(
			"Enter name of salesman followed by the number of products sold in each column respectively: \n");
	for (int i = 0; i < num_of_emp; i++) {
		for (int j = 0; j < num_of_products + 1; j++) { // num_of_products + 1 to consume name first
			if (j == 0) {
				logger_debug("Getting name \n");
				scanf("%s", &names[i]);
				sprintf(debug_str, "name: %s\n", names[i]);
				logger_debug(debug_str);
				continue;
			}
			scanf("%d", &matrix[i][j - 1]); // j-1 to place in correct array spot
			sprintf(debug_str, "value %d: %d\n", j, matrix[i][j - 1]);
			logger_debug(debug_str);
		}
		clean_stdin();
	}

	printf("***************************************************\n");
	printf("Salesmen\tProducts\t\tTotal(Salesmen)\n");
	printf("***************************************************\n");
	// Print Rows + Row Sums
	for (int i = 0; i < num_of_emp; i++) {

		int count_row = 0;
		printf("%s\t", names[i]); // print name
		for (int j = 0; j < num_of_products; j++) {
			count_row += matrix[i][j];
			printf("\t$%d ", matrix[i][j]); // print each sale
		}
		printf("\t$%d \n", count_row); // print total
	}

	printf("***************************************************\n");

	// Count and print column sums
	printf("Total (Product)");
	for (int i = 0; i < num_of_products; i++) {
		int count_col = 0;
		for (int j = 0; j < num_of_emp; j++) {
			count_col += matrix[j][i];
		}
		printf("\t$%d ", count_col); // print item totals
	}

	printf("\n");
	printf("***************************************************\n");
}
