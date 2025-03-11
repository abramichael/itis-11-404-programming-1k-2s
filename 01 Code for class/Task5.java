public class Task5 {
	
	public static boolean isLetter(char c) {
		return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
	}
	
	public static boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}
	
	public static boolean checkIfIdentifier(String input) {
		char c = input.chatAt(0);
		if (c != '_' && !isLetter(c)) {
			return false;
		}
		for (int i = 1; i < input.length(); i++) {
			c = input.charAt(i);
			if (c != '_' && !isLetter(c) && !isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args) {
		
		String input = "aa111";
		boolean check = checkIfIdentifier(input);
		System.out.println(check);
		
	}
	
}