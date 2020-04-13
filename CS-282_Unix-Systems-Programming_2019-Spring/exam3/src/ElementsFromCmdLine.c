#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "globals.h"

/**
 * Name: Thomas Rokicki
 * Date: May 14
 * Prog: Exam3: determine the compound weight
 */

void run(int argc, char *argv[]);
float calculateWeight(char str[]);
float determineMultiplier(char str[]);
int getCount(char str[]);
bool userWishesToContinue(void);
void clean_stdin(void);

int main(int argc, char*argv[]) {
	do {
		run(argc, argv);
	} while (userWishesToContinue());

	printf("Have a great summer!");
	return EXIT_SUCCESS;
}

/**
 * Continuous function
 *
 * Determine the molecular weight and print it out
 */
void run(int argc, char *argv[]) {

	if (argc < 2) {
		printf("Too less arguments!!! \n");
	} else {
		float weight = 0;

		int index = 1;
		while (index < argc) {
			weight += calculateWeight(argv[index]);
			index++;
		}

		printf("Molecular weight of the Compound entered is %.2f amu.\n",
				weight);
	}
}

float calculateWeight(char str[]) {
	int atomCount = 0;
	float multiplier = determineMultiplier(str);

	if (multiplier != 0) {
		atomCount = getCount(str);
	}
	return multiplier * atomCount;
}

float determineMultiplier(char* str) {
	if (strcmp(str, "Carbon") == 0) {
		return CARBON;
	} else if (strcmp(str, "Hydrogen") == 0) {
		return HYDROGEN;
	} else if (strcmp(str, "Oxygen") == 0) {
		return OXYGEN;
	} else if (strcmp(str, "Nitrogen") == 0) {
		return NITROGEN;
	} else {
		printf("\n%s not found as an element in the Program!\n", str);
		return 0;
	}
}

int getCount(char str[]) {
	int atomCount;
	printf("Please enter no. of atoms in %s\n", str);
	scanf("%d", &atomCount);
	clean_stdin();
	// printf("[DEBUG] Atom Count : %d\n", atomCount);
	return atomCount;
}
/**
 * Function to check if the user would like to continue
 */
bool userWishesToContinue(void) {
	char user_input;
	printf("\nDo you wish to continue? Enter 'y' or 'n' \n");
	scanf("%s", &user_input);
	void clean_stdin(void);

	if (user_input == 'y') {
		return true;
	} else if (user_input == 'n') {
		return false;
	} else {
		printf("\nInvalid input.\n");
		return userWishesToContinue();
	}
}

/**
 * For flushing the buffer
 */
void clean_stdin(void) {
	int c;
	do {
		c = getchar();
	} while (c != '\n' && c != EOF);
}
