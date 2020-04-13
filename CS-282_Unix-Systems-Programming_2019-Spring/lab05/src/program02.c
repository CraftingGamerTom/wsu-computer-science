/*
 * program02.c
 *
 *   Created on: Feb 7, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */


#include<stdio.h>
#include<string.h>
#include "myflush.h"

void execute_problem02() {
	const int MAX_LENGTH = 30;
	printf("START PROBLEM 2\n");

	char str_1[MAX_LENGTH], str_2[MAX_LENGTH];

	printf("Enter String 1: \n");
	scanf("%[^t\n]s", &str_1);
	clean_stdin();
	printf("Enter String 2: \n");
	scanf("%[^t\n]s", &str_2);
	clean_stdin();

	// ********** 2A **********

	// Solve with strcmp
	if (strcmp(str_1, str_2) < 0) {
		printf("A: String 2 is bigger.\n");
	} else if (strcmp(str_1, str_2) > 0) {
		printf("A: String 1 is bigger.\n");
	} else {
		printf("A: Strings are equal.\n");
	}


	// ********** 2B **********

	// Solve WITHOUT strcmp
	int str_1_count = 0, str_2_count = 0;

	// Count the ASCII values
	for(int i = 0; i < MAX_LENGTH; i++) {

		if(str_1[i] == '\0') {
			break;
		}
		str_1_count += str_1[i];
	}
	for(int i = 0; i < MAX_LENGTH; i++) {

		if(str_2[i] == '\0') {
			break;
		}
		str_2_count += str_2[i];
	}

	// Compare the values and print
	if (str_1_count < str_2_count) {
		printf("B: String 2 is bigger.\n");
	} else if (str_1_count > str_2_count) {
		printf("B: String 1 is bigger.\n");
	} else {
		printf("B: Strings are equal.\n");
	}

}
