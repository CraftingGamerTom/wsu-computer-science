/*
 ============================================================================
 Name        : project04.c
 Author      : Thomas Rokicki
 Date		 : 03-23-19
 Version     : 1.0.0
 Copyright   : All Rights Reserved.
 Description : A LinkedList of Students
 ============================================================================
 */

#include <malloc.h>
#include <stdlib.h> // For EXIT_SUCCESS
#include <time.h>
#include <stdbool.h>

// Mine
#include "myflush.h"
// use clean_stdin();

struct date {
	int day, month, year;
};
struct student {
	int student_id;
	char student_name[30];
	float gpa;
	struct date dt_of_reg;
};
struct node {
	struct student value;
	struct node *next;
};

// Linked list functions - ideally would go into a C++ template file
void appendNode(struct node **, int id);
void addBeginNode(struct node **, int id);
void insertNode(struct node *, int id);
void printNodes(struct node *);
void countNodes(struct node *);
void deleteNode(struct node **ptr);

// Lab 2.1 functions
struct student getStudentData(int);
void printStudentData(struct student*, int*);

// Project 4 functions
bool checkStudentExists(struct node *ptr, int id);
bool validateDateOfReg(struct date *dt);

// My Functions
int getPosition(char *questionString);

int main(void) {
	struct node *ptr;
	ptr = NULL; //Empty Linked List
	int choice = 0;
	int id;
	do {
		printf(" \nOperations on Linked List");
		printf(" \n*************************");
		printf(" \n 1. Append a New Node");
		printf(" \n 2. Add a new New Node in the Beginning");
		printf(" \n 3. Insert a New Node");
		printf(" \n 4. Print the Linked List");
		printf(" \n 5. Delete a node");
		printf(" \n 6. Count Nodes");
		printf(" \n 7. Quit");
		printf(" \n Enter Choice (1-7): ");
		scanf("%d", &choice);
		clean_stdin();
		printf(" \n*************************");
		printf(" \n");

		switch (choice) {
		case 1:
			id = getStudentID(ptr);
			appendNode(&ptr, id);
			break;
		case 2:
			id = getStudentID(ptr);
			addBeginNode(&ptr, id);
			break;
		case 3:
			id = getStudentID(ptr);
			insertNode(ptr, id);
			break;
		case 4:
			printNodes(ptr);
			break;
		case 5:
			deleteNode(&ptr);
			break;
		case 6:
			countNodes(ptr);
			break;
		case 7:
			break;
		}
	} while (choice != 7);

	return EXIT_SUCCESS;
}

// Lab 12.1 functions Start

struct student getStudentData(int id) {
	struct student new_student;
	char str[30];

	new_student.student_id = id;

	// Set Name
	printf("Enter Student's name:\n");
	scanf("%[^\t\n]s", str);
	clean_stdin();
	strcpy(new_student.student_name, str);

	// Set GPA
	printf("Enter Student's gpa: \n");
	scanf("%f", &new_student.gpa);
	clean_stdin();

	// Set user registration date
	struct date input_date;
	do {
		printf("Enter Student's Date of Registration (mm/dd/yyyy): \n");
		scanf("%d/%d/%d", &input_date.month, &input_date.day, &input_date.year);
		clean_stdin();
	} while (validateDateOfReg(&input_date) == false);
	new_student.dt_of_reg = input_date;
	return new_student;
}

void printStudentData(struct student *stud_ptr, int *recs) {
	printf(" \n\n *********** Student Records ************ \n");
	for (int i = 0; i < *recs; i++, stud_ptr++) {
		printf(" Student Id: %d \n", stud_ptr->student_id);
		printf(" Student Name: %s \n", stud_ptr->student_name);
		printf(" Student gpa: %.2f \n", stud_ptr->gpa);
		printf(" Student's Date of Registration: %d/%d/%d \n\n",
				stud_ptr->dt_of_reg.month, stud_ptr->dt_of_reg.day,
				stud_ptr->dt_of_reg.year);
	}
	printf(" \n **************************************** \n");
}

// Lab 12.1 functions End

// Lab 12.2 functions Start

/*Adds a node at the end of the Linked List */
void appendNode(struct node **ptr, int id) {
	struct node *temp, *temp2;
	struct student val = getStudentData(id);
	if (*ptr == NULL) /*If the list is empty, create first node*/
	{
		temp = (struct node*) malloc(sizeof(struct node));
		temp->value = val;
		temp->next = NULL;
		*ptr = temp;
	} else {
		temp = *ptr;
		/*Traverse the list and reach the end*/
		while (temp->next != NULL)
			temp = temp->next;
		/*Add the node at the end */
		temp2 = (struct node *) malloc(sizeof(struct node));
		temp2->value = val;
		temp2->next = NULL;
		temp->next = temp2;
	}
}
/*Prints the contents of the linked list */
void printNodes(struct node *ptr) {
	if (ptr == NULL) {
		printf("Nothing to print. LinkedList is empty.");
		return;
	}

	/*Traverse the entire linked List*/
	while (ptr != NULL) {
		struct student stud = ptr->value;
		printf("\n*************************\n");
		printf(" Student Id: %d \n", stud.student_id);
		printf(" Student Name: %s \n", stud.student_name);
		printf(" Student gpa: %.2f \n", stud.gpa);
		printf(" Student's Date of Registration: %d/%d/%d \n\n",
				stud.dt_of_reg.month, stud.dt_of_reg.day, stud.dt_of_reg.year);
		ptr = ptr->next;
	}
	printf("*************************\n");
}
/*Adds a node at the beginning of the Linked List */
void addBeginNode(struct node **ptr, int id) {
	struct node *temp;
	struct student val = getStudentData(id);
	temp = (struct node *) malloc(sizeof(struct node));
	temp->value = val;
	temp->next = *ptr;
	*ptr = temp;
}
/*Adds a new node at the specified location of the Linked List */
void insertNode(struct node *ptr, int id) {
	int position = getPosition("After what position?");

	struct node *temp, *temp2;
	struct student val = getStudentData(id);
	temp = ptr;
	/* skip to desired location */
	for (int i = 0; i < position - 1; i++) {
		temp = temp->next;
		if (temp == NULL) {
			printf(" \nThere are less than %d elements in the list.", position);
		}
	}
	/* Insert new node */
	temp2 = (struct node *) malloc(sizeof(struct node));
	temp2->value = val;
	temp2->next = temp->next;
	temp->next = temp2;
}

/* Delete a node from the linked list */
void deleteNode(struct node **ptr) {
	struct node *previousNode, *toBeDeleted;
	previousNode = *ptr; // init at start of linked list

	if (previousNode == NULL) {
		printf("\nThere is nothing to delete.\n");
		return;
	}

	int position = getPosition("Which position?");
	/* skip to desired location */
	for (int i = 0; i < position - 1; i++) {
		previousNode = previousNode->next;
		if (previousNode == NULL) {
			printf(" \nThere are less than %d elements in the list.", position);
			return;
		}
	}
	/* Remove node */
	if (position == 0) {
		*ptr = previousNode->next;
		free(previousNode);
	} else {
		toBeDeleted = previousNode->next;
		previousNode->next = toBeDeleted->next;
		free(toBeDeleted);
	}
}

/* Count the number of nodes in the Linked List */
void countNodes(struct node *ptr) {
	int count = 0;
	/*Traverse the entire linked List*/
	while (ptr != NULL) {
		count++;
		ptr = ptr->next;
	}
	printf("%d \n", count);
}
// Lab 12.2 functions End

// Project 4 functions Start
bool checkStudentExists(struct node *ptr, int id) {
	while (ptr != NULL) {
		if (ptr->value.student_id == id) {
			printf("Student ID exists. \n");
			return true;
		}
		ptr = ptr->next;
	}
	return false;
}

bool validateDateOfReg(struct date *dt) {
	// Get today's date
	time_t T = time(NULL);
	struct tm tm = *localtime(&T);

	if ((dt->month > 12 || dt->month < 0) || (dt->day > 31 || dt->day < 0)
			|| (dt->year < 2010)
			|| (dt->year > tm.tm_year && dt->month > tm.tm_mon
					&& dt->day > tm.tm_mday)) {
		printf(" \nImproper date entered. \n");
		return false;
	} else {
		return true;
	}
}

// Project 4 functions End

// My Functions Start
int getPosition(char *questionString) {
	printf(" \n%s ", questionString);
	int pos = 0;
	scanf("%d", &pos);
	clean_stdin();

	if (pos < 0) {
		printf("Not a valid position. %d", pos);
	} else {
		return pos;
	}
}

int getStudentID(struct node *ptr) {
	// Set ID
	int id_val = 0;
	do {
		printf("Enter Student's ID: \n");
		scanf("%d", &id_val);
		clean_stdin();
	} while (checkStudentExists(ptr, id_val)); // If student exists ask again

	return id_val;
}
// My Functions End
