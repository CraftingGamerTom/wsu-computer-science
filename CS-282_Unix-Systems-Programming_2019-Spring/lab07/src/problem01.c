/*
 * problem01.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

void execute_problem01() {

		int arr[10], size, sum = 0, i, *p;
		size = sizeof(arr) / sizeof(arr[0]);
		printf("Enter the elements of an array: \n");
		for (i = 0; i < size; i++) {
			scanf("%d", &arr[i]);
		}
		clean_stdin();
		p = arr; //or p=&arr[0]//
		for (i = 0; i < size; i++) {
			sum = sum + *p;
			p++;
		}
		printf("Sum is: %d \n", sum);
}
