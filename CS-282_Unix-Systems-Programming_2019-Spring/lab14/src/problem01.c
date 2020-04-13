/*
 * problem01.c
 *
 *   Created on: Mar 28, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include<stdio.h>
#include<stdlib.h>

#include "myflush.h"
// use clean_stdin();

void execute_problem01() {

	FILE *fptr1, *fptr2;
	struct student_grades {
		char name[20];
		int assign1;
		int assign2;
		int assign3;
	};
	int num_students = 0;
	if ((fptr1 = fopen("Grades.csv", "w")) == NULL)
		printf(" \n Error opening File");
	printf(" \nHow many students are there?: ");
	scanf("%d", &num_students);
	clean_stdin();
	printf(
			" \n----------------------Input data----------------------------------\n");
	printf(" ----------- Student Name\tAssign#1\tAssign#2\tAssign#3 -------\n");
	printf(
			" --------------------------------------------------------------------\n");
	for (int i = 0; i < num_students; i++) {
		struct student_grades sgrad;
		printf(" \nStudent %d. ", i + 1);
		fscanf(stdin, "%s\t%d\t%d\t%d", sgrad.name, &sgrad.assign1,
				&sgrad.assign2, &sgrad.assign3);
		fprintf(fptr1, "%s , %d , %d , %d \n", sgrad.name, sgrad.assign1,
				sgrad.assign2, sgrad.assign3);
	}
	fclose(fptr1);

	if ((fptr1 = fopen("Grades.csv", "r")) == NULL)
		printf(" \n Error opening File");
	if ((fptr2 = fopen("Report.txt", "w")) == NULL)
		printf(" \n Error opening File");
	fprintf(fptr2, " Students' Assignment Statistics \n");
	fprintf(fptr2, " \n--- Name \t Total marks \t Average ------\n");
	for (int i = 0; i < num_students; i++) {
		char line[100]; // Used by commented-out code
		int tot_marks = 0;
		float marks_average = 0;
		struct student_grades sgrad;
		char comma = ',';
		//Following commented-out code is alternate code for fscanf() on the following line
		//fgets(line,100,fptr1);
		//sscanf(line,"%s %c %d %c %d %c %d",sgrad.name,&comma,&sgrad.assign1,&comma,&sgrad.assign2,&comma,&sgrad.assign3);
		fscanf(fptr1, "%s %c %d %c %d %c %d", sgrad.name, &comma,
				&sgrad.assign1, &comma, &sgrad.assign2, &comma, &sgrad.assign3);
		tot_marks = sgrad.assign1 + sgrad.assign2 + sgrad.assign3;
		marks_average = (float) tot_marks / 3;
		fprintf(fptr2, "%s \t\t %d \t\t %0.2f\n", sgrad.name, tot_marks,
				marks_average);
	}
	rewind(fptr1);
	/*
	 This part of the code to calculate the Average of Class in each Assignment has to be completed by
	 students.
	 */
	fclose(fptr1);
	fclose(fptr2);

}
