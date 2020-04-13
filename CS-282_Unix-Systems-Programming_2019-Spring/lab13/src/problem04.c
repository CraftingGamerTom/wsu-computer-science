/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include "myflush.h"
// use clean_stdin();

void execute_problem04() {
	int count = 0;

	FILE *fptr1;
	if ((fptr1 = fopen("original.dat", "r")) == NULL)
		printf(" \n Error opening File");
	char c;
	while ((c = fgetc(fptr1)) != EOF) {
		if (c == ' ' || c == '\n') {
			count++;
		}
	}
	fclose(fptr1);

	printf("Count: %d", count + 1); // Plus 1 for last word
}
