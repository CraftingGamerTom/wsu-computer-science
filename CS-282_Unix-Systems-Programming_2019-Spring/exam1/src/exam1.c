#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

/**
 * Name: Thomas Rokicki
 * Date: Feb 19
 * Prog: Exam1
 */

void run(void);
bool userWishesToContinue(void);
void clean_stdin(void);

const int SAFE_LIMIT = 100000000;

int main(void) {

	do {
		run();
	} while (userWishesToContinue());

	printf("Have a good night!");

	return EXIT_SUCCESS;
}

/**
 * Continuous function
 */
void run(void) {
	int user_limit;

	printf("Enter an upper limit: ");
	scanf("%d", &user_limit);

	if (user_limit > SAFE_LIMIT) { // Ensure the limit is not massive
		printf("ERROR: Limit is %d, your value has been set to 5000.",
				SAFE_LIMIT);
		user_limit = SAFE_LIMIT;
	}

	fib(user_limit);

	printf("\n");
	fib_recursive(0, 0, user_limit);

	printf("\n");
	printf("%d", fib_return(1, 1, user_limit));

}

void fib(int user_limit) {
	if (user_limit < 1) { // Ensure the limit is not too low
		printf(
				"ERROR: Your limit cannot be less than 1. Limit has been set to 1");
		user_limit = 1;
	}

	int one = 0, two = 1, num = one + two;

	// 0 1 1 2 3 5 8 13
	printf("\n0 1 "); // first value always
	while (num < user_limit) {
		num = one + two;
		if (num <= user_limit) {
			printf("%d ", num);
			one = two;
			two = num;
		}
	}
}

void fib_recursive(int first, int second, int limit) {
	//init
	if(first == 0 && second == 0) {
		printf("0 1");
		fib_recursive(0, 1, limit);
		return;
	}

	int added = first + second;

	if (added < limit) {
		printf(" %d", added);
		fib_recursive(second, added, limit);
	} else if (added > limit) {
		printf(" %d - FINISHED", second);
		return;
	} else if (added == limit) {
		printf(" %d - FINISHED", added);
		return;
	} else {
		return; // shouldnt happen
	}
}

int fib_return(int first, int second, int limit) {
	int added = first + second;

	if(added > limit) {
		return second;
	} else {
		return fib_return(second, added, limit);
	}
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
