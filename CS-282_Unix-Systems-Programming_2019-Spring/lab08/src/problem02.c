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
void reverse(int *, int*);

void execute_problem02() {
	int arr[50], num, *p;
	printf("Enter number of elements: \n");
	scanf("%d", &num);
	printf("Enter the elements of an array: \n");
	for (int i = 0; i < num; i++) {
		scanf("%d", &arr[i]);
	}
	clean_stdin();
	reverse(arr, &num);

}

/* Function to Print the Array of Integers in Reverse */
void reverse(int *arr, int *n) {
	int *ptr;
	ptr = arr[*n - 1];

	for (; ptr > arr; ptr--) {
		//printf("\n index is: %d :: ", i);
		printf("%d", *ptr);
	}
}
