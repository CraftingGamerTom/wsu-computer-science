package TestNine;

/* TODO:
Complete the class definition. Supply the body of the constructor
and any instance fields.
*/

/**
A rectangle whose interior is filled with a pattern
obtained by repeating a character.
*/
public class FilledRectangle extends Rectangle
{
	private int width;
	private int height;
	private char fill;
/**
   Constructs a rectangle with a given width, height, and fill
   @param aWidth the width (including the corners)
   @param aHeight the height (including the corners)
   @param aFill the fill character
*/
public FilledRectangle(int aWidth, int aHeight, char aFill)
{
	super(aWidth, aHeight);
   width = aWidth;
   height = aHeight;
   fill = aFill;
}


/**
   Prints one line of the rectangle.
   @param i the line to print (1 <= i <= height)
*/
public void printLine(int i)
{
   if (i == 1 || i == getHeight())
      printHelper('+', '-');
   else
      printHelper('|', fill);
}




// The following method tests your class

public static void main(String[] args)
{
   FilledRectangle fr = new FilledRectangle(10, 7, '*');
   fr.print();
}
}

