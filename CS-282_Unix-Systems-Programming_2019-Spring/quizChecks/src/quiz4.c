/*
 * quiz3.cpp
 *
 *   Created on: Feb 16, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

void quiz4();
void change(int *b, int n);

void quiz4() {

	printf("\n");
	// 1
	char s[] = "Learn C!!";
	printf("\n%s", &s[1]);

	printf("\n");
	// 2
	int i = -5, j = -2;
	fun_2(i, &j);
	printf("i = %d j = %d\n", i, j);

	printf("\n");
	// 7
	char *str = "Hello";
	char *ptr = str;
	printf("%c\t%c", 1[ptr], str[1]);

	printf("\n");
	// 8
	int k = 5;
	int *p = &k;
	int **m = &p;
	**m = 6;
	printf("%d\n", k);

	printf("\n");
	// 9
	int a[3] = { 1, 2, 3 };
	int *p_9 = a;
	int **r = &p_9;
	printf("%p %p", *r, a);

	printf("\n");
	// 10
	int arr[4] = { 1, 2, 3, 4 };
	int *p_10;
	p_10 = arr + 3;
	*p_10 = 5;
	printf("%d\n", arr[3]);

	printf("\n12] ");
	// 12
	int i_12, arr_12[] = { 2, 4, 6, 8, 10 };
	change(arr_12, 5);
	for (i_12 = 0; i_12 <= 4; i_12++)
		printf("%d, ", arr_12[i_12]);

	printf("\n13] ");
	// 13
	char str_13[] = "Spring Break!";
	char *s_13 = str_13;
	printf("%s", s_13++ + 2);

	printf("\n14] ");
	// 14
	int i_14 = 20;
	int *p_14 = &i_14;
	func(p_14);
	printf("i = %d\n", i_14);


	printf("\n15] ");
	// 15
	int i_15=3, *j_15, k_15;
	j_15 = &i_15;
	printf("%d\n", i_15**j_15*i_15+*j_15);

	printf("\n16] ");
	// 16
	char p_16[] = "%d\n";
	p_16[1] = 'c';
	printf(p_16,65);

	printf("\n17] ");
	// 17
	char a_17[] = "\0";
	printf("%s", a_17)? printf("The string is empty\n"):printf("The string is not empty\n");

	printf("\n18] ");
	// 18
	char str1[] = "Hello";
	char str2[] = "Hello";
	(str1 == str2)? printf("Equal\n"): printf("Unequal\n");

	printf("\n19] ");
	// 19
	char str_19[] = "Hello";
	char *s_19 = str_19;
	printf("%s ", s_19++ +3);
	printf("%s",s_19);

	printf("\n20] ");
	// 20
	printf(7+"Spring Break!\n");

}

void fun_2 (int i, int *j)
{
    i = i*i;
    *j = *j**j;
}

void change(int *b, int n) {
	int i;
	for (i = 0; i < n; i++)
		*(b + 1) = *(b + i) + 5;
}
