package InClass;

public class PrintTriangle {

	public static void printTriangle(int sideLength)
	{
		if (sideLength < 1)
		{
			return;
		}
		
		printTriangle(sideLength - 1);
		
		for (int i =0; i < sideLength; i++)
		{
			System.out.print("[]");
			
		}
		System.out.println();
	}
	
	public static void main(String[] arguments)
	{
		printTriangle(4);
	}
}