/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

void execute_problem03() {
	printf("START PROBLEM 3\n");

	const int MAX_LENGTH = 30;
	char str_1[MAX_LENGTH], str_2[MAX_LENGTH], output[MAX_LENGTH * 2 + 1];

	printf("Enter String 1: \n");
	scanf("%[^t\n]s", &str_1);
	clean_stdin();
	printf("Enter String 2: \n");
	scanf("%[^t\n]s", &str_2);
	clean_stdin();

	int insert_position = 0;
	while (insert_position < MAX_LENGTH && str_1[insert_position] != '\0') {
		//printf("insert_position val: %d\n", insert_position);

		output[insert_position] = str_1[insert_position];
		insert_position++;
	}

	int index = 0;
	while (index < MAX_LENGTH && insert_position < MAX_LENGTH * 2
			&& str_2[index] != '\0') {
		//printf("index val: %d\n", index);
		//printf("insert_position val: %d\n", insert_position);

		output[insert_position] = str_2[index];
		insert_position++;
		index++;
	}
	output[insert_position] = '\0';

	printf("String was concatenated to \n%s", output);
}
