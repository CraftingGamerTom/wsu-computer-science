/*
 * problem01.c
 *
 *   Created on: Mar 19, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include "myflush.h"
// use clean_stdin();

// != EOF

void execute_problem01() {
	FILE *fptr1, *fptr2;
	if ((fptr1 = fopen("original.dat", "r")) == NULL)
		printf(" \n Error opening File");
	if ((fptr2 = fopen("copy2.txt", "w")) == NULL)
		printf(" \n Error opening File");
	char c;
	while ((c = fgetc(fptr1)) != EOF)
		fputc(c, fptr2);
	fclose(fptr1);
	fclose(fptr2);
}
