/*
 * selfchallange.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

// Self inflicted challenge

// Program to write:
// 3 4 5
// 2 3 4
// 1 2 3
// Should print 1, 4, 9, 8, 5 (Add diagonally)

#include<stdio.h>
#include "myflush.h"

const int ROW_SIZE = 3;
const int COL_SIZE = 3;

void self_inflictedChallenge() {
	printf("We are creating a 3x3 matrix");
	int array[ROW_SIZE][COL_SIZE];

	// Input
	for(int i = 0; i < COL_SIZE; i++) {
		for(int j = 0; j < ROW_SIZE; j++) {
			scanf("%d", &array[i][j]);
		}
		clean_stdin();
	}

	// Print sum
	for(int i = 0; i < COL_SIZE-1; i++) {
		int count = 0;
		for(int j = ROW_SIZE-1; j > 0; j--) {
			printf("ARRAY: %d\n", array[j][i]);
			count++;
		}
	}
}

