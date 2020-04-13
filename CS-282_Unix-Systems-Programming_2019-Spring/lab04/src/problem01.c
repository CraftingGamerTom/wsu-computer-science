/*
 * problem01.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

void execute_problem01() {
	printf("START PROBLEM 1\n");

	int position = 0, arr[10], element, count = 0;
	printf("Enter 10 numbers: \n");
	for (int i = 0; i < 10; i++) {
		scanf("%d", &arr[i]);
		clean_stdin();
	}

	printf("Enter element to be searched: \n");
	scanf("%d", &element);
	clean_stdin();

	for (int i = 0; i < 10; i++) {
		if (arr[i] == element) {
			position = i + 1;
			printf("Element %d found at position %d. \n", element, position);
			count++;
		}
	}
	if (count > 0) {
		printf("Element %d occurs %d times. \n", element, count);
	} else {
		printf("Element %d not found. \n", element);
	}
}
