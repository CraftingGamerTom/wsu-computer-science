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

#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct date {
	int day, month, year;
};
struct student {
	int student_id;
	char student_name[30];
	float gpa;
	struct date dt_of_reg;
};
void getStudentData(struct student*, int*);
void printStudentData(struct student*, int*);

void execute_problem01() {
	struct student stud_recs[3];
	struct student *stud_ptr;
	int num;
	stud_ptr = stud_recs;
	printf("How many student records? \n");
	scanf("%d", &num);
	clean_stdin();
	getStudentData(stud_recs, &num);
	printStudentData(stud_ptr, &num);
}

void getStudentData(struct student *stud_ptr, int *recs) {
	for (int i = 0; i < *recs; i++, stud_ptr++) {
		char str[30];
		printf("Enter Student's ID: \n");
		scanf("%d", &stud_ptr->student_id);
		clean_stdin();
		printf("E nter Student's name:\n");
		scanf("%[^\t\n]s", str);
		clean_stdin();
		*stud_ptr->student_name = (char*) malloc(strlen(str) + 1);
		strcpy(stud_ptr->student_name, str);
		printf("Enter Student's gpa: \n");
		scanf("%f", &stud_ptr->gpa);
		clean_stdin();
		printf("Enter Student's Date of Registration (mm/dd/yyyy): \n");
		scanf("%d/%d/%d",&stud_ptr->dt_of_reg.month, &stud_ptr->dt_of_reg.day, &stud_ptr->dt_of_reg.year);
		clean_stdin();
	}
}
void printStudentData(struct student *stud_ptr, int *recs) {
	printf(" \n\n *********** Student Records ************ \n\n");
	for (int i = 0; i < *recs; i++, stud_ptr++) {
		printf(" Student Id: %d \n", stud_ptr->student_id);
		printf(" Student Name: %s \n", stud_ptr->student_name);
		printf(" Student gpa: %.2f \n", stud_ptr->gpa);
		printf(" Student's Date of Registration: %d/%d/%d \n\n",
				stud_ptr->dt_of_reg.month, stud_ptr->dt_of_reg.day,
				stud_ptr->dt_of_reg.year);
	}
}
