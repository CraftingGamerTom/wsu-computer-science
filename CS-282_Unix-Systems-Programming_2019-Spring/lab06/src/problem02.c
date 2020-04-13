/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include "myflush.h"

#include<stdio.h>
#include "myflush.h"

/*
 * Global Variable: Month
 */
char monthName[][10] = { "January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December" };

struct date_type {
	int day;
	int month;
	int year;
};

void printFullDate(struct date_type);

void execute_problem02() {
	struct date_type date;
	printf("Enter day, month, year: dd mm yyyy \n");
	scanf("%d %d %d", &date.day, &date.month, &date.year);
	clean_stdin();
	printFullDate(date);

}

void printFullDate(struct date_type date) {
	printf("%d %s %d", date.day, monthName[date.month - 1], date.year);
}
