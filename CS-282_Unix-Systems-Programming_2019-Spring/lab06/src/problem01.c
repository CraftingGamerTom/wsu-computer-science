/*
 * problem01.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

/*
 * Global Variable
 */

void leapyear(int year);

void execute_problem01() {
	int year;
	printf("Enter year: \n");
	scanf("%d", &year);
	clean_stdin();

	leapyear(year);
}

void leapyear(int year) {
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
		printf("%d is a leap year \n", year);
	} else {
		printf("%d is not a leap year \n", year);
	}
}
