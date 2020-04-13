/*
 * problem01.c
 *
 *   Created on: Mar 19, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

# include <stdio.h>
#include "myflush.h"
// use clean_stdin();

struct date {
	int month, day, year;
};
int check_date(struct date *dt);

void execute_problem01() {
	int chkdt1, chkdt2;
	/*The dates to be compared */
	struct date d1, d2;
	/*Input the dates to be compared*/
	printf(" \nEnter the First date to be compared: ");
	chkdt1 = check_date(&d1);
	printf(" \nEnter the Second date to be compared: ");
	chkdt2 = check_date(&d2);
	if (chkdt1 != 0 && chkdt2 != 0) {
		/*Compare the two structures*/
		if ((d1.month == d2.month) && (d1.day == d2.day)
				&& (d1.year == d2.year))
			printf(" \nDates are Equal");
		else
			printf(" \nDates are Not Equal");
	}
}

/* Function to check the date entered */
int check_date(struct date *dt) {
	printf("(mm/dd/yyyy): ");
	scanf("%d/%d/%d", &dt->month, &dt->day, &dt->year);
	clean_stdin();
	if ((dt->month > 12 || dt->month < 0) || (dt->day > 31 || dt->day < 0)
			|| (dt->year > 2200 || dt->year < 1900)) {
		printf(" \nImproper date entered");
		return 0;
	} else {
		return 1;
	}
}
