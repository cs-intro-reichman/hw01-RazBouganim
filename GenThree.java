/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int range = b - a;
		int first = (int)(Math.random() * range) + a;
		int second = (int)(Math.random() * range) + a;
		int third = (int)(Math.random() * range) + a;
		double min = Math.min(third, Math.min(first, second));
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("The minimal generated number was " + (int)min);
	}
}
