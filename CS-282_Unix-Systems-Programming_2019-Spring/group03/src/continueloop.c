/*
 * continueloop.c
 *
 *   Created on: Feb 3, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include <stdio.h>
#include <stdbool.h>

// Mine
#include "logger.h"

bool userWishesToContinue() {
	const int ARRAY_SIZE = 4;
	char user_input[ARRAY_SIZE];
	memset(user_input, 0, sizeof(user_input));
	printf("\nDo you wish to continue? Enter (Y)es or (N)o  \n");
	scanf("%s", user_input);
	logger_info(user_input);

	// Convert to all lower for easy comparison
	logger_debug(user_input); // Before conversion
	for (int i = 0; i < ARRAY_SIZE; i++) {
		if (user_input[i] == 0) {
			break;
		}
		user_input[i] = tolower(user_input[i]);
	}
	logger_debug(user_input); // After conversion

	if (strcmp(user_input, "y") == 0|| strcmp(user_input, "yes") == 0) {
		return true;
	} else if (strcmp(user_input, "n") == 0 || strcmp(user_input, "no") == 0) {
		return false;
	} else {
		printf("\nInvalid input.\n");
		return userWishesToContinue();
	}

}
