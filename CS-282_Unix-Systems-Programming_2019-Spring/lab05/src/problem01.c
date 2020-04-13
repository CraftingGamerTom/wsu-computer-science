/*
 * problem01.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include<string.h>
#include "myflush.h"



void execute_problem01() {
	const int MAX_LENGTH = 11;
	printf("START PROBLEM 1\n");

	int length_a, length_b = 0;
	char str[MAX_LENGTH];
	printf("Enter a String: \n");
	//gets(str);
	scanf("%[^t\n]s", str);
	clean_stdin();
	length_a = strlen(str); // 1A

	// 1B
	int index = 0;
	while(index < MAX_LENGTH && str[index] != '\0') {
		length_b++;
		index++;
	}

	// Print results for both ways
	printf("1A: Length of string is %d\n", length_a);
	printf("1B: Length of string is %d\n", length_b);
	printf("\n");
}
