
public class Main {
	public static void main(String[] args) {


		// Prima dell'introduzione dell'autoboxing
		Integer n = new Integer(10);
		Boolean b = new Boolean(true);

		// Con l'introduzione dell'autoboxing
		Integer n1 = 10;
		Boolean b1 = true;
		
		System.out.println(123 == 123);
		System.out.println(123 == new Integer(123));
		System.out.println(new Integer(123) == new Integer(123));
	}
}
