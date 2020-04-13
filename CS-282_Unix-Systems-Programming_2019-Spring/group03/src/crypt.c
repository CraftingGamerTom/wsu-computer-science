/*
 ============================================================================
 Name        : group01.c
 Author      : Thomas Rokicki
 Version     : 1.0.0
 Copyright   : All Rights Reserved.
 Description : Activity 1.1
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
#include <string.h>

#include "continueloop.h"

void runInput(void);
void runFile(void);

void encrypt(char *str, int *length);
void decrypt(char *str, int *length);

int main(void) {

	do {
		//runInput();
		runFile();
	} while (userWishesToContinue());
	return EXIT_SUCCESS;
}

void runInput(void) {

	char str[20];
	int length;
	memset(str, 0, sizeof(str));

	printf("Enter String: ");
	scanf("%s", str);
	printf("Enter Length: ");
	scanf("%d", &length);
	encrypt(&str, &length);
	printf("String: %s\n", str);
	decrypt(&str, &length);
	printf("String: %s\n", str);
}

void runFile(void) {
	int length, taskValue;

	printf("Enter 1(encrypt) or 2(decrypt): ");
	scanf("%d", &taskValue);
	printf("Enter Length: ");
	scanf("%d", &length);

	FILE *fptr1, *fptr2;
	if ((fptr1 = fopen("original.txt", "r")) == NULL)
		printf(" \n Error opening File");
	if ((fptr2 = fopen("output.txt", "w")) == NULL)
		printf(" \n Error opening File");

	char str[20];
	while ((fscanf(fptr1, " %[^\t]s", str)) != EOF) {
		switch (taskValue) {
		case 1:
			encrypt(&str, &length);
			break;
		case 2:
			decrypt(&str, &length);
			break;
		default:
			printf("Invalid Operation.");
			return;
		}
		fprintf(fptr2, "%s", str);
	}

	fclose(fptr1);
	fclose(fptr2);
}

void encrypt(char *str, int *length) {
	//printf("e1: %d\n", *length);
	while (*str != '\0') {
		//printf("e2: %c\n", *str);
		*str = *str + *length;

		//printf("e3: %c\n", *str);
		str++;
	}
}

void decrypt(char *str, int *length) {
	//printf("d1: %d\n", *length);
	while (*str != '\0') {
		//printf("d2: %c\n", *str);
		*str = *str - *length;

		//printf("d3: %c\n", *str);
		str++;
	}
}
