/*
 * helper.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: Class for my flush function (Found on web)
 */

#include<stdio.h>

void clean_stdin(void) {
	int c;
	do {
		c = getchar();
	} while (c != '\n' && c != EOF);
}
