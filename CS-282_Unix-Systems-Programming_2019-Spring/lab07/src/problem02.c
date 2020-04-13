/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

void execute_problem02() {
	char str[50], *p;
	int length = 0;
	printf("Enter a string: \n");
	gets(str);
	p = str;
	while (*p != '\0') {
		length++;
		p++;
	}
	printf("Length of String is: %d \n", length);
}
