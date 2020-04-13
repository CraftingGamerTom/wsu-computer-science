/*
 * problem01.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include <malloc.h>
#include <stdio.h>
#include <string.h>
#include "myflush.h"
// use clean_stdin();

void execute_problem01() {
	/*Program to overcome limitation of array of pointers to strings*/
	char *names[5];
	char str[20];
	for (int i = 0; i < 5; i++) {
		printf("\nEnter name: ");
		//gets(str);
		scanf("%[^\t\n]s", str);
		clean_stdin();
		names[i] = (char*) malloc(strlen(str));
		strcpy(names[i], str);
	}

	for (int i = 0; i < 5; i++)
		printf("%s\n", names[i]);
}
