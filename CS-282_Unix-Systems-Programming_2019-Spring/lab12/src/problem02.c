/*
 * problem03.c
 *
 *   Created on: Feb 5, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

#include <stdio.h>
#include <stdlib.h>
struct node {
	int value;
	struct node *next;
};
void appendNode(struct node **);
void addBeginNode(struct node **);
void insertNode(struct node *, int*);
void printNodes(struct node *);
void countNodes(struct node *);
void deleteNode(struct node **ptr);

#include "myflush.h"
// use clean_stdin();

void execute_problem02() {
	struct node *ptr;
	ptr = NULL; //Empty Linked List
	int choice = 0;
	int pos = 0;
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
		printf(" \n");

		switch (choice) {
		case 1:
			appendNode(&ptr);
			break;
		case 2:
			addBeginNode(&ptr);
			break;
		case 3:
			printf(" \nAfter what position? ");
			scanf("%d", &pos);
			clean_stdin();
			insertNode(ptr, &pos);
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
}

/*Adds a node at the end of the Linked List */
void appendNode(struct node **ptr) {
	struct node *temp, *temp2;
	int val;
	printf(" \nEnter the value of new node: ");
	scanf("%d", &val);
	clean_stdin();
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
	/*Traverse the entire linked List*/
	while (ptr != NULL) {
		printf("%d ", ptr->value);
		ptr = ptr->next;
	}
	printf(" \n");
}
/*Adds a node at the beginning of the Linked List */
void addBeginNode(struct node **ptr) {
	struct node *temp;
	int val;
	printf(" \nEnter the value of new node: ");
	scanf("%d", &val);
	clean_stdin();
	temp = (struct node *) malloc(sizeof(struct node));
	temp->value = val;
	temp->next = *ptr;
	*ptr = temp;
}
/*Adds a new node at the specified location of the Linked List */
void insertNode(struct node *ptr, int *pos) {
	struct node *temp, *temp2;
	int val;
	printf(" \nEnter the value of new node: ");
	scanf("%d", &val);
	clean_stdin();
	temp = ptr;
	/* skip to desired location */
	for (int i = 0; i < *pos - 1; i++) {
		temp = temp->next;
		if (temp == NULL) {
			printf(" \nThere are less than %d elements in the list.", *pos);
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

	if(previousNode == NULL) {
		printf("\nThere is nothing to delete.\n");
		return;
	}

	int position = 0;
	printf(" \nWhich position? ");
	scanf("%d", &position);
	clean_stdin();

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

