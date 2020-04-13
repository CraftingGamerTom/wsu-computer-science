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

void quiz5();

struct p4 {
	struct p4 *next;
	int x;
};

/*struct numbers {
	int x = 2;
	int y = 3;
}*/

struct employee {
	char *emp;
};

typedef struct student {
	char *stud;
} s1;

struct point {
	int x;
	int y;
};

struct point20
     {
   int x;
   int y;
   int z;
       };

void fun(struct point p[]) {
//	printf("%d %d\n", p->x, *(p + 1).y);
}

void fun8(struct point p[])

{
	printf("%d %d\n", p->x, (*(p + 1)).y);
}

void quiz5() {

	printf("\nQ3: \n");
	char *ptr = calloc(100, 1);
	ptr = "Welcome";
	printf("%s\n", ptr);

	printf("\nQ4: \n");
	struct p4* p1 = malloc(sizeof(struct p4));
	p1->x = 1;
	p1->next = malloc(sizeof(struct p4));
	printf("%d\n", p1->next->x);

	printf("\nQ5: \n");
	struct employee e1;
	struct employee *ePtr = &e1;
	(*ePtr).emp = "Hello";
	printf("%d\n%d\n", ePtr, &e1);

/*
	printf("\nQ6: \n");
	struct numbers nums;
	nums.x = 110;
	nums.y = 100;
	printf("%d\n%d", nums.x, nums.y);
*/

	printf("\nQ7: \n");
	s1 s;
	s.stud = "Amy";
	printf("%s", s.stud);

	printf("\nQ8: \n");
	struct point p1_08[] = { 1, 2, 3, 4, 5, 6 };
	fun8(p1_08);

	printf("\nQ20: \n");
	struct point20 p20 = { .y = 0, .z = 1, .x = 2 };
	printf("%d %d %d", p20.x, p20.y, p20.z);

	printf("\nQ9: \n");
	struct point p1_09[] = { 1, 2, 3, 4, 5, 6 };
	fun(p1_09);

	printf("\nQ16: \n");
	char *ptr16;
	printf("%s", "test1");
	*ptr16 = (char) malloc(30);
	printf("%s", "test2");
	strcpy(ptr16, "Hello");
	printf("%s", ptr16);
	free(ptr16);

	printf("\n");
}
