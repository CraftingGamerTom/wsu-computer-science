/*
 * quiz3.cpp
 *
 *   Created on: Feb 16, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

void quiz3();
void func();

void quiz3() {
// 1
	//int arr_a[2][] = {10,20,30,40};

	int arr_b[][2] = {10,20,30,40};
	    for (int i = 0; i< 2; i++)
	        for (int j= 0; j<2; j++)
	            printf("%d ", arr_b[i][j]);

		printf("\n");

	//int arr_c[][] = {10,20,30,40};
/*
	int arr_d = {10,20,30,40};
    for (int i = 0; i< 2; i++)
        for (int j= 0; j<2; j++)
            printf("%d ", arr_d[i][j]);
*/
	printf("\n");
// 2
	int my_array[5] = { [2] = 7, [4] = 6 };

	for (int i = 0; i < 5; i++) {
		printf("%d ", my_array[i]);
	}

	printf("\n");

// 3
	int arr3[5] = { 1 };
	for (int i = 0; i < 5; i++) {
		printf("%d ", arr3[i]);
	}

	printf("\n");

// 4
	int arr[5] = { 1 };
	for (int i = 0; i <= 5; i++) {
		printf("%d ", arr[i]);
	}

	printf("\n");

// 5
	// CT error
	/*
	 int a[][] = { { 1, 2 }, { 3, 4 } };
	 for (int i = 0; i < 2; i++) {
	 for (int j = 0; j < 2; j++) {
	 printf("%d ", a[i][j]);
	 }
	 }
	 */
	printf("5 - CT error");
	printf("\n");

// 6
	int a[5] = { 5, 1, 15, 20, 25 };
	int i, j, m;
	i = ++a[1];
	j = a[1]++;
	m = a[i++];
	printf("%d, %d, %d", i, j, m);

	printf("\n");

// 7
	int arr7[3][2][2] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
	printf("value for 7: %d", arr7[2][1][0]);

	printf("\n");

// 8
	int i8 = 3;
	if (i8 % 2) {
		i8 = 0;
	} else {
		i8 = 1;
	}
	if (i8 % 2) {
		i8 = 0;
	} else {
		i8 = 1;
	}
	printf("8 = %d", i8);

	printf("\n");

// 9
	printf("9 = %d", strcmp("strcmp()", "strcmp()"));

	printf("\n");

// 10

	int a10[3] = { 2, 1 };
	printf("10 = %d", a10[a10[1]]);

	printf("\n");

// 11
	// CT Error for two commas
	/*
	 int a11[3] = {2,,1};
	 printf("%d",a11[a11[0]]);
	 */

	printf("11 - CT error");

	printf("\n");

// 12
// Answered without code
	printf("12 - answered without code");
	printf("\n");

// 13

	printf("13 - answered without code");
	printf("\n");

// 14
	printf("14: ");
	void func();
	printf(" | ");
	void func();
	printf("\n");

// 15
	static char str1[] = "cester";
	static char str2[20];
	static char str3[] = "Wor";
	int i15;
	i15 = strcmp(strcat(str3, strcpy(str2, str1)), "Worcester");
	printf("%d", i15);

	printf("\n");

// 16
	char s16[25] = "Hello";
	int i16 = 0;
	char ch;
	ch = s16[++i16];
	printf("%c", ch);
	ch = s16[i16++];
	printf("%c", ch);

	printf("\n");

// 17
	int i17;
	char a17[] = "";
	if (printf("%s", a17)) {
		printf("The string is empty");
	} else {
		printf("The string is not empty");
	}

	printf("\n");

// 18
	char str1_17[] = "Hello";
	char str2_17[] = "Hello";
	if (str1_17 == str2_17) {
		printf("Equal");
	} else {
		printf("Unequal");
	}

	printf("\n");

// 19
	printf("%c", "abcdefgh"[4]);

	printf("\n");

// 20
}

void func() {
	auto int i = 0;
	register int j = 0;
	static int k = 0;
	i++;
	j++;
	k++;
	printf("\n %d % d %d", i, j, k);
}

