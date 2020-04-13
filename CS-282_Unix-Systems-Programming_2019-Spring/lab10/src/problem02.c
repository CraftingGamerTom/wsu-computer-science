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

void execute_problem02(int argc, char*argv[]) {
	/* Program accepts string from Command Line and converts to Upper Case
	 Author: S Nagpal */
	if (argc < 2)
		printf("Too less arguments!!! \n");
	else if (argc > 2)
		printf("Too many arguments!!! \n");
	else {
		for (int i = 0; argv[1][i] != '\0'; i++) {
			if ((argv[1][i] >= 'a') && (argv[1][i] <= 'z'))
				argv[1][i] = argv[1][i] - 32;
		}
		printf("%s", argv[1]);
	}
}
