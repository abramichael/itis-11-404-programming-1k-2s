public class Task2 {
	
	public static int fact(int n) {
		int p = 1;
		for (int i = 1; i <= n; i++) {
			p *= i;
		}
		return p;
	}
	
	public static void main(String [] args) {
		
		int n = 10;
		double x = 0.5;
		double s = 0;
		long t1 = System.nanoTime();
		for (int i = 1; i <= n; i++) {
			s = s + Math.pow(x, i) / fact(i);
		}
		long t2 = System.nanoTime();
		System.out.println(s);
		System.out.println("time of execution: " + (t2 - t1));
		
		double s2 = 0;
		int f = 1;
		double d = 1;
		t1 = System.nanoTime();
		for (int i = 1; i <= n; i++) {
			f = f * i;
			d = d * x;
			s2 = s2 + d / f;
		}
		t2 = System.nanoTime();
		System.out.println(s2);
		System.out.println("time of execution: " + (t2 - t1));
		
	}
	
}