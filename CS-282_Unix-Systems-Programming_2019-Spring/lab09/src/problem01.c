/*
 * problem01.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"
// use clean_stdin();

#define ERRORS 5

char *err_msg[] = { "All's well", "File Not Found",
		"No Read Permission for File", "Insufficient Memory",
		"No Write Permission for File" };

void execute_problem01() {
	char **ptr;
	ptr = err_msg;
	for (int i = 0; i < ERRORS; i++, ptr++) {
		printf("Error message %d is %s \n", i + 1, *ptr);
	}
}
