package HomeworkSeven;

//TODO: Determine whether a or b do not represent an integer
//by catching the NumberFormatException. If either one is not an integer,
//use the value 0 when computing the sum.

public class Numbers {
	public int add(String a, String b) {
		try{
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			return x + y;
		}catch (NumberFormatException notValidInteger){
			int newX = determineInt(a);
			int newY = determineInt(b);
			return newX + newY;
		}
		
	}
	
	public static int determineInt(String test){
		for (int index = 0; index < test.length(); index++){
			char testCharacter = test.charAt(index);
			switch (testCharacter){
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				break;
			default:
				return 0;
			}
		}
		return Integer.parseInt(test);
	}
}