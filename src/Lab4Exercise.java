
public class Lab4Exercise {

	public static void main(String[] args) {
		System.out.println(factorialRecursion(4));

	}

	public static int factorialRecursion(int counter) {
		int factorial;
		if (counter == 1)
			return 1;

		// System.out.println(counter);
		// I struggled with this and had to look it up on stack overflow.
		// figuring out how to keep track of everythink on the stac was tricky
		factorial = factorialRecursion(counter - 1) * counter;
		return factorial;
	}

}
