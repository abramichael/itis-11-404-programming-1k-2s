public class Task1 {
	public static int sumOfDigits(int n) {
		int s = 0;
		while (n > 0) {
			s += n % 10;
			n = n / 10;
		}
		return s;
	}
	public static void main(String []args) {
		int n = Integer.parseInt(args[0]);
		int s = sumOfDigits(n);
		System.out.println("Answer: " + s);	
	}
}