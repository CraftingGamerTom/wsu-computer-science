package HomeworkSeven;

public class Arithmetic {
	/**
	 * Checks whether an arithmetic expression is valid.
	 * 
	 * @param value1
	 *            a string that should contain an integer
	 * @param operator
	 *            a string that should contain an operator + - * or /
	 * @param value2
	 *            a string that should contain an integer
	 * @return true if all parameters are correct and the resulting expression
	 *         can be evaluated without an exception
	 */
	public static boolean check(String value1, String operator, String value2) {
		boolean canRun = false;

		boolean isOperator = operator(operator);
		boolean isIntOne = integer(value1);
		boolean isIntTwo = integer(value2);
		if (isOperator == true && isIntOne == true && isIntTwo == true) {
			if (operator.charAt(0) == '/' && value2.charAt(0) == '0') {
				canRun = false;
			} else {
				canRun = true;
			}
		} else {
			canRun = false;
		}

		return canRun;
	}

	public static boolean operator(String operator) {
		if (operator.length() == 1) {
			char test = operator.charAt(0);
			switch (test) {
			case '+':
			case '-':
			case '*':
			case '/':
				return true;
			default:
				return false;
			}
		} else {
			return false;
		}
	}

	public static boolean integer(String input) {
		for (int index = 0; index < input.length(); index++) {
			char test = input.charAt(index);
			switch (test) {
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
				return false;
			}
		}
		return true;
	}

}