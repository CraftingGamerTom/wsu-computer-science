package InClass;

import java.util.Scanner;

public class PartyBounce {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String nameInput;
		boolean access;
		
		String[] list = {"Chloe", "Angela", "Bart", "Francis", "Elizabeth", "George", "Harrison", "Huey"};
		
		
		do{
		System.out.println("Who is seeking entry to the party?");
		nameInput = in.next();
		
		
		if (!nameInput.equalsIgnoreCase("quit"))
		{
			access = checkName(nameInput, list);
			if (access == true)
			{
				System.out.println("Allow " + nameInput + " to enter!");	
			}
			
		    else{
			System.out.println("Turn " + nameInput + " away, not on the list.");
		    }
		}
		
		} while (!nameInput.equalsIgnoreCase("quit"));
		
		
		in.close();
	}

	public static boolean checkName(String nameInput, String[] list)
	{
		int index = 0;
		boolean found = false;
		boolean access = false;
		
		while (index < list.length && !found)
		{
			if (list[index].equals(nameInput))
			{
				access = true;
				break;
			}
			index++;
		}
		
		return access;
				
	}
	
}
