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

int main(void) {

	int bestScore = TRIES_ALLOWED + 1; // +1 to ensure score will never actually be that

	do {
		int score = run();
		if (score < bestScore) {
			bestScore = score;
		}
	} while (userWishesToContinue());

	if (bestScore > TRIES_ALLOWED) {
		printf("You lost every game!");
	} else {
		printf("Your best score is: %d", bestScore);
	}

	return EXIT_SUCCESS;
}

int run(void) {
	srand(time(0));
	int random = (rand() % 100) + 1;
	bool correctAnswer = false;

	for (int count = 0; count < TRIES_ALLOWED; count++) {
		int guess;
		printf("Guess a number: ");
		scanf("%d", &guess);
		printf("\n");

		if (guess == random) {
			printf("You won! The number was: %d\n", random);
			correctAnswer = true;
			return count;
		} else if (guess < random) {
			printf("Your guess of %d was too low\n", guess);
		} else {
			printf("Your guess of %d was too high\n", guess);
		}
	}

	if (!correctAnswer) {
		printf("You lost!");
		return TRIES_ALLOWED + 1; // Did not get it correct
	}
}
