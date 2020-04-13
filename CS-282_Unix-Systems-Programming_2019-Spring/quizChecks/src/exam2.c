/*
 * quiz3.cpp
 *
 *   Created on: Feb 16, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

void exam2();

struct num {
	int x;
};

struct node {
	int data;
	struct node * next;
};
typedef struct node NODE;

#include<stdio.h>

struct student {
	char *c;
};

struct p {
	int x;
	int y;
};

void exam2() {

	printf("\nQ1: \n");
	int arr[6] = { 10, 20, 30, 40, 50, 60 };
	int *p;
	p = arr + 5;
	*p = 50;
	printf("%d\n", arr[5]);

	printf("\nQ3: \n");
	int x = 65;
	int *p3 = &x;
	void *q;
	q = p3;
	char *r;
	r = q;
	printf("%c", *r);

	printf("\nQ3: \n");
	struct num n1 = { 3 };
	struct num *ptr;
	ptr = &n1;
	printf("%d %d %d", n1.x, ptr->x, (*ptr).x);

	printf("\nQ7: \n");
	char str1[] = "Hello";
	char str2[] = "Hello";
	(str1 == str2) ? printf("Equal\n") : printf("Unequal\n");

	printf("\nQ10: \n");
	char *str;
	str = "%s";
	printf(str, "S");

	printf("\nQ11: \n");
	int a[3][4] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	printf("%d, %d, %d", a[0] + 1, *(a[0] + 1), *(*(a + 0) + 1));

	printf("\nQ14: \n");
	NODE * ptr14;
	ptr14 = (NODE*) malloc(sizeof(NODE));
//	ptr14=(NODE*)malloc(NODE);
	ptr14 = (NODE*) malloc(sizeof(NODE*));
//	ptr14=(NODE)malloc(sizeof(NODE));

	printf("\nQ15: \n");
	struct student n15;
	struct student *s;
	s = &n15;
	(*s).c = "hello";
	printf("%d\n%d\n", s, &n15);

	printf("\nQ16: \n");
	struct p p1[] = { 1, 2, 3, 4, 5, 6 };
	struct p *ptr1 = p1;
	printf("%d %d\n", ptr1->x, (ptr1 + 2)->x);

	printf("\n");
}
