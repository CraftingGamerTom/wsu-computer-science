/*
 ============================================================================
 Name        : project01.c
 Author      : Thomas Rokicki
 Version     : 1.0.0
 Copyright   : All Rights Reserved.
 Description : Program to Calculate distance between locations
 ============================================================================
 */

/*
 * GRADING
 * Comments: 5
 * Descriptive and meaningful variables: 5
 * Correct Header files included: 3
 * Proper User Prompts: 5
 * Conversion of degrees to radians: 5
 * Correct usage of constants pi and earth's radius: 4
 * Formula applied correctly: 5
 * Formatting output: 4
 * Program executes and tested with actual values: 9
 * Extra Effort on going beyond what was asked in Project: 5
 * (Eg. using an Extra loop Construct for Making the program execute continuously, till user asks to exit!
 * OR Maybe the way constants are declared in the preprocessor phase of the program execution!!! )
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

// Mine
#include "logger.h"
#include "continueloop.h"

void promptUserInput();
float calculateDistance();

const float EARTH_RADIUS = 6371.01; // Mean radius in kilometers
const float PI = 3.141592654; // Estimated value of Pi

// https://stackoverflow.com/questions/14920675/is-there-a-function-in-c-language-to-calculate-degrees-radians
#define degToRad(angleInDegrees) ((angleInDegrees) * PI / 180.0)
#define radToDeg(angleInRadians) ((angleInRadians) * 180.0 / PI)

float place1_long, place1_lat, place2_long, place2_lat;

int main(void) {

	do {
		//printf("Hello\n");
		promptUserInput();
		logger_debug("Starting Calculating");
		float result = calculateDistance();
		logger_debug("Done Calculating");

		printf("Distance is: %f\n", result);
	} while(userWishesToContinue());


	puts("Hello World"); /* prints Hello World */
	return EXIT_SUCCESS;
}

/**
 * Get the user input to calculate distance
 */
void promptUserInput() {
	char str[100];
	printf("Place 1 Longitude: ");
    scanf("%f",&place1_long);
    sprintf (str, "Place 1 Longitude: %f", place1_long);
    logger_debug(str);

	printf("Place 1 Latitude: ");
    scanf("%f",&place1_lat);
    sprintf (str, "Place 1 Latitude: %f", place1_lat);
    logger_debug(str);

	printf("Place 2 Longitude: ");
    scanf("%f",&place2_long);
    sprintf (str, "Place 2 Longitude: %f", place2_long);
    logger_debug(str);

	printf("Place 2 Latitude: ");
    scanf("%f",&place2_lat);
    sprintf (str, "Place 2 Latitude: %f", place2_lat);
    logger_debug(str);

	logger_debug("Input Received");
}

/**
 * Calculate and return the distance based on user input (using Spherical Law of Cosines)
 */
float calculateDistance() {
	logger_debug("Calculating");
	return EARTH_RADIUS*acos(sin(degToRad(place1_lat))*sin(degToRad(place2_lat))+cos(degToRad(place1_lat))*cos(degToRad(place2_lat))*cos(degToRad(place1_long) - degToRad(place2_long)));
}
