/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"
// use clean_stdin();

void execute_problem03(int argc, char *argv[]) {
	if (argc < 2)
		printf("Too less arguments!!! \n");
	else if (argc > 2)
		printf("Too many arguments!!! \n");
	else {
		char *ptr = argv[1];
		for (; *ptr != '\0'; ptr++) {
			if ((*ptr >= 'a') && (*ptr <= 'z'))
				*ptr = *ptr - 32;
		}
		printf("%s", argv[1]);
	}
}
