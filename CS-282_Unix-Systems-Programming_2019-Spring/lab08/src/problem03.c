/*
 * problem03.c
 *
 *   Created on: Feb 26, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"
// use clean_stdin();

void reverse2(char*);

const int STR_LENGTH = 50;

void execute_problem03() {
	char str[STR_LENGTH];
	memset(str, 0, sizeof(str)); // Clear the memory we intend to use..
	char *ptr;
	printf("Enter a string: \n");
	gets(str);
	printf("HIT\n");
	reverse2(str);
	printf("Reversed String is %s \n", str);
}

/* Function to reverse the String */
void reverse2(char *string) {

	int length = strlen(string);

	printf("HIT2\n");
	char *ptr_start = string;
	char *ptr_end = string + (length - 1);

	int count = 0;
	printf("length is %d\n", length);
	while (count < (length / 2)) {
		char temp;
		temp = *ptr_start;
		*ptr_start = *ptr_end;
		*ptr_end = temp;

		ptr_start++;
		ptr_end--;
		count++;
	}
}
