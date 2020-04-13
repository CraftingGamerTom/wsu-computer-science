/*
 ============================================================================
 Name        : project03.c
 Author      : Thomas Rokicki
 Date		 : 03-05-19
 Version     : 1.0.0
 Copyright   : All Rights Reserved.
 Description : Project 3
 ============================================================================
 */

#include <malloc.h>
#include <stdlib.h> // For EXIT_SUCCESS

// Mine
#include "continueloop.h"
#include "myflush.h"
// use clean_stdin();

void run(void);
void sortNames(char **names, int count);
int compare(char *str1, char *str2);

const MAX_LENGTH = 20;

int main(void) {
	do {
		run();
	} while (userWishesToContinue());

	return EXIT_SUCCESS;
}

void run(void) {
	int name_count;
	printf("How many names in the list?: ");
	scanf("%d", &name_count);

	if (name_count > 0) {
		char *names[name_count];
		char str[MAX_LENGTH];

		printf("\n");
		for (int i = 0; i < name_count; i++) {
			memset(str, 0, MAX_LENGTH);
			printf("Enter name %d: ", i + 1);

			// Get each name
			scanf(" %[^\t\n]s", &str);
			clean_stdin();
			// allocate the needed memory
			names[i] = (char*) malloc(strlen(str) + 1);
			strcpy(names[i], str);
		}

		// Sort the names by reference
		sortNames(&names, name_count);

		// print the names in order
		for (int i = 0; i < name_count; i++) {
			printf("%s\n", names[i]);
		}
	}
}

void sortNames(char **names, int count) {
	int i, j;
	for (i = 0; i < count - 1; i++) { // -1 because bubble sort has n-1 iterations

		for (j = 0; j < count - i - 1; j++) {
			char *ptr1 = names[j]; // str1
			char *ptr2 = names[j + 1]; // str2
			int result = compare(ptr1, ptr2);

			if (result > 0) { // swap if str1 > str2
				names[j] = ptr2;
				names[j + 1] = ptr1;
			}
		}
	}
}

int compare(char *str1, char *str2) {
	// Loops while strings are the same to get to the end
	for (; (*str1 || *str2) && (*str1 == *str2); str1++, str2++)
		;
	// conditional based on the character after the strings no longer match
	return (*str1 == *str2) ? 0 : ((*str1 > *str2) ? 1 : -1);
}
