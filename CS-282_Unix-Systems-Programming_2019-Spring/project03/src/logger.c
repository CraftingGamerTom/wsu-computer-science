/*
 * logger.c
 *
 *   Created on: Feb 3, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include "logger.h"
#include <stdio.h>
#include <time.h>
#include <stdbool.h>

const bool DEBUG_MODE = false;

/**
 * Logging with custom tag
 * Preferable not to use this - demonstration only
 */
void logger(const char* tag, const char* message) {
	time_t now;
	time(&now);
	printf("%s [%s]: %s\n", ctime(&now), tag, message);
}

/**
 * Logging with Debug level
 */
void logger_debug(const char* message) {
	if (DEBUG_MODE) {
		time_t now;
		time(&now);
		printf("%s [%s]: %s\n", ctime(&now), "DEBUG", message);
	}
}

/**
 * Logging with info level
 */
void logger_info(const char* message) {
	time_t now;
	time(&now);
	printf("%s [%s]: %s\n", ctime(&now), "INFO ", message);
}
