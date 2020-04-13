/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include "myflush.h"
// use clean_stdin();

// fscanf(fptr1, " %[^ \t]s", str)

// != EOF

void execute_problem03() {
	FILE *fptr1, *fptr2;
	if ((fptr1 = fopen("original.dat", "r")) == NULL)
		printf(" \n Error opening File");
	if ((fptr2 = fopen("copy3.txt", "w")) == NULL)
		printf(" \n Error opening File");

	char *line[100];
	while ((fscanf(fptr1, " %[^\t]s", line)) != EOF) {
		fprintf(fptr2, "%s", line);
	}
	fclose(fptr1);
	fclose(fptr2);
}
