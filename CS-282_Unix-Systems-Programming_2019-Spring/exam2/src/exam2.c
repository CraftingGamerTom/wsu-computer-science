#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

/**
 * Name: Thomas Rokicki
 * Date: Apr 4
 * Prog: Exam2
 * Intent: Determine if a string is a palindrome
 */

void withUserInput(void);
void withFileInput(void);
bool isAPalindrome(char *str);

bool userWishesToContinue(void);
void clean_stdin(void);

int main(void) {

	do {
		withUserInput();

		//withFileInput();
	} while (userWishesToContinue());

	printf("\nHave a good weekend!\n");

	return EXIT_SUCCESS;
}

/*
 * Does not work because it gets the whole line. Not a singe word. Not enought time to complete
 */
void withFileInput(void) {

	FILE *fptr;
	if ((fptr = fopen("palindrome.txt", "r")) == NULL)
		printf(" \n Error opening File");

	char *line[100];
	while ((fscanf(fptr, " %[^\t]s", line)) != EOF) {
		bool isPalindrome = isAPalindrome(line);

		if (isPalindrome) {
			printf("%s is a palindrome.\n", line);
		} else {
			printf("%s is NOT a palindrome.\n", line);
		}
	}
	fclose(fptr);
}

void withUserInput(void) {

	char str[25];

	printf("Enter a string: ");
	scanf("%s", str);
	clean_stdin();

	bool isPalindrome = isAPalindrome(str);

	if (isPalindrome) {
		printf("%s is a palindrome.\n", str);
	} else {
		printf("%s is NOT a palindrome.\n", str);
	}

}

bool isAPalindrome(char *str) {
	// This is BAD code .. multiple levels of abstraction haha!

	// Position the string pointer to last index
	char *reverse = str;
	while (*str != '\0') {
		str++;
	}
	str--; // Backtrack to previous (none '\0')

	// Backtrack to set the reverse
	while (str >= reverse) {
		if (*str == *reverse) {
			str--;
			reverse++;
		} else {
			return false;
		}
	}
	return true;
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
