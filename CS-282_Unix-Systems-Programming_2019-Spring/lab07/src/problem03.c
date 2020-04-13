/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

const int MAX_LENGTH = 50;

void execute_problem03() {
	char str[MAX_LENGTH], *p;
	int length = 0;
	printf("Enter a string: \n");
	gets(str);
	p = str;
	for (int i = 0; i < MAX_LENGTH; i++) {
		if (*p == '\0') {
			break;
		}
		length++;
		p++;
	}
	printf("Length of String is: %d \n", length);
}
