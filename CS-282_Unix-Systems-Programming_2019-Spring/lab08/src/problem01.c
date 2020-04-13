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
void swap_one(int*, int*);
void swap_two(int*, int*);

void execute_problem01() {
	int num1, num2;
	printf("\nEnter first number: ");
	scanf("%d", &num1);
	fflush(stdin);
	printf("\nEnter second number: ");
	scanf("%d", &num2);
	fflush(stdin);

	swap_one(&num1, &num2);
	printf("\nSwapped numbers are: \n");
	printf("\n First number: %d", num1);
	printf("\n Second number: %d\n", num2);
	swap_two(&num1, &num2);
	printf("\nSwapped Back Again!!! \n");
	printf("\n First number: %d", num1);
	printf("\n Second number: %d\n", num2);

}

void swap_one(int *a, int *b) {
	int temp;
	temp = *a;
	*a = *b;
	*b = temp;
}

void swap_two(int *a, int *b) {
	*a = *a + *b;
	*b = *a - *b;
	*a = *a - *b;
}
