package java8;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {
	public static void main(String[] args) {

		System.out.println("-------------Array-------------");
		int[] a = { 1, 1, 6, 8, 9, 5, 3, 4, 66, 44, 54, 23, 56 };

		System.out.println("Sum of All Numbers: " + Arrays.stream(a).sum());

		System.out.println("Sum of Even Numbers: " + Arrays.stream(a).filter(x -> x % 2 == 0).sum());

		System.out.println("Sum of Odd Numbers: " + Arrays.stream(a).filter(x -> x % 2 == 1).sum());

		System.out.print("All Elements: ");
		Arrays.stream(a).forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.println("Smallest Number of All: " + Arrays.stream(a).min().getAsInt());

		System.out.println("Largest Number of All: " + Arrays.stream(a).max().getAsInt());

		System.out.println("----------List------------------");

		List<Integer> list = Arrays.asList(3, 2, 4, 5, 6, 3, 2, 1);

		System.out.println(
				"Sum of Twice of even Digits: " + list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum());
		System.out.print("Double all Numbers : ");
		list.stream().map(x -> 2 * x).forEach(x -> System.out.print(x + " "));
		System.out.println();

		System.out.println("Sum of All Numbers: " + list.stream().mapToInt(x -> x).sum());

		System.out.println("Sum of Even Numbers: " + list.stream().mapToInt(x -> x).filter(x -> x % 2 == 0).sum());

		System.out.println("Sum of Odd Numbers: " + list.stream().mapToInt(x -> x).filter(x -> x % 2 == 1).sum());
	}
}
