/*
 * problem02.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */


#include<stdio.h>
#include "myflush.h"

void execute_problem02() {
	printf("START PROBLEM 2\n");

	int zero = 0, even = 0, odd = 0;

	int position = 0, arr[10];
	printf("Enter 10 numbers: \n");
	for (int i = 0; i < 10; i++) {
		scanf("%d", &arr[i]);
		clean_stdin();
	}

	for (int i = 0; i < 10; i++) {
		printf("Number is:  %d \n", arr[i]);

		if(arr[i] == 0) { // Zero
			zero++;
		} else if(arr[i] % 2 == 0) {// Even
			even++;
		} else if(arr[i] % 2 == 1) { // Odd
			odd++;
		} else {
			printf("ERROR: Did not match any case.");
		}
	}

	printf("Zero Count: %d \n", zero);
	printf("Even Count: %d \n", even);
	printf("Odd Count: %d \n", odd);
}


