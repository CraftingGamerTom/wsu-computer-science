/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include <stdbool.h>
#include "myflush.h"
// use clean_stdin();

const char months[12][10] =
		{ "January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December" };

struct date {
	int month, day, year;
};

bool check_date_validity(struct date *dt);

void printFullDate(struct date *inputDate);

void execute_problem02() {
	struct date inputDate;
	printf(" \nEnter the First date to be compared: ");
	bool isValid = check_date_validity(&inputDate);

	if (isValid) {
		printFullDate(&inputDate);
	} else {
		printf("Not a valid date");
	}
}

/* Function to check the date entered */
bool check_date_validity(struct date *dt) {
	printf("(mm/dd/yyyy): ");
	scanf("%d/%d/%d", &dt->month, &dt->day, &dt->year);
	clean_stdin();
	if ((dt->month > 12 || dt->month < 0) || (dt->day > 31 || dt->day < 0)
			|| (dt->year > 2200 || dt->year < 1900)) {
		printf(" \nImproper date entered");
		return false;
	} else {
		return true;
	}
}

void printFullDate(struct date *inputDate) {
	printf("%s %d, %d", months[inputDate->month-1], inputDate->day, inputDate->year);
}
