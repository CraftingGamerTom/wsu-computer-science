/*
 ============================================================================
 Name        : group01.c
 Author      : Thomas Rokicki
 Version     : 1.0.0
 Copyright   : All Rights Reserved.
 Description : Activity 1.1
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

#include "continueloop.h"

int run(void);

const int TRIES_ALLOWED = 10;

int compare(char *str1, char *str2);

int main(void) {

	do {
		run();
	} while (userWishesToContinue());
	return EXIT_SUCCESS;
}

int run(void) {

	char str1[20];
	char str2[20];

	printf("Enter str1: ");
	scanf("%s", str1);
	printf("Enter str2: ");
	scanf("%s", str2);

	int result = compare(str1, str2);
	if(result < 0) { // Left is bigger
		printf("Str1 is bigger");
	} else if (result > 0) {
		printf("Str2 is bigger");
	} else {
		printf("Strings are the same");
	}

}


int compare(char *str1, char *str2) {
	printf("HIT COMPARE\n");
		// Check letters that have a corresponding letter
		while(*str1 != '\0' && *str2 != '\0') {
			if(*str1 < *str2) {
				return -1;
			} else if(*str1 > *str2) {
				return 1;
			}

			str1++;
			str2++;
		}
		// Check for remaining letters
		if(*str1 != '\0') {
			return -1;
		} else if(*str2 != '\0') {
			return 1;
		} else {
			return 0;
		}

	// Check letters that have a corresponding letter
	/*while ((*str1 != '\0' || *str2 != '\0') && (*str1 == *str2)){
		if (*str1 < *str2) {
				printf("-1");
				return -1;
			} else if (*str1 > *str2) {
				printf("1");
				return 1;
			} else {
				printf("0");
				return 0;
			}

		str1++;
		str2++;
		printf("1: %c | 2: %c", *str1, *str2);
	}
	*/

}
