/*
 * quiz2.c
 *
 *   Created on: Feb 8, 2019
 *       Author: tcrokicki
 *  Description: [ADD DESCRIPTON]
 */

int quiz2();

int quiz2() {
// Question 1
int   i = 4, j = -1, k = 0, w, x, y, z ;
w = i || j || k;
x = i && j && k;
y = i || j && k;
z = i && j || k;

printf("%d", w);
printf("%d", x);
printf("%d", y);
printf("%d", z);

printf("\n");

// Question 2
int  k2, num = 30 ;
k2 = ( num > 5 ? ( num <= 10 ? 100 : 200 ) : 500 ) ;
printf("%d", k2);

printf("\n");

// Question 3
int j2 = 4;
( ! j2 != 1 ? printf ( "\nWelcome") : printf ( "\nGood Bye") ) ;

printf("\n");

// Question 4
int  x2 = 4, y2, z2;
y2 = --x2;
z2 = x2-- ;
printf ( "\n%d %d %d", x2, y2, z2 );

printf("\n");

// Question 5
int  x5 = 4, y5 = 3, z5 ;
z5 = x5-- -y5 ;
printf ( "\n%d %d %d", x5, y5, z5 ) ;

printf("\n");

// Question 6 (infinite)
//for ( int i = 1; i <= 5; printf ( "\n%d", i ) ) ;

printf("\n");

// Question 7
int true = 0, false ;
while ( true )
{
	   false = 1 ;
	   printf("t");
}

printf("\n");

// Question 14
int i14 = 0;
 for ( ;  i14 < 9; ++i14 )
     printf("%d ",i14 );

 printf("\n");

 // Question 17
 int i17 = 3;
 switch (i17)
 {
	 case 0+1: printf("Hi There");
			 break;
	 case 1+2: printf("CS282");
			 break;
	 default: printf("Bye");
 }

 printf("\n");

 // Question 18 (compile time error)
/*
 float i18 = 1.5;
 switch (i18)
 {
	 case 1: printf("Hi There");
			 break;
	 case 1.5: printf("CS282");
			 break;
	 default: printf("Bye");
 }

 printf("\n");

*/

// Question 19
int i19 = 1;
switch (i19)
	{
		case 1: printf("Hi There ");
		case 2: printf("CS282 ");
		default: printf("Bye");
	}

printf("\n");

// Question 20 (infinite loop)
/*
for(1;2;3)
	printf("Hi");

printf("\n");
*/

}
