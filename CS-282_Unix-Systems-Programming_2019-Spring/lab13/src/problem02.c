/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include "myflush.h"
// use clean_stdin();

// != NULL

void execute_problem02() {
	FILE *fptr1, *fptr2;
	if ((fptr1 = fopen("original.dat", "r")) == NULL)
		printf(" \n Error opening File");
	if ((fptr2 = fopen("copy2.txt", "w")) == NULL)
		printf(" \n Error opening File");
	char c;
	while ((c = fgetc(fptr1)) != EOF) {
		char line[100];
		if ((fgets(line, 100, fptr1)) == NULL) {
			fputs(line, fptr2);
		}
	}
	fclose(fptr1);
	fclose(fptr2);
}
