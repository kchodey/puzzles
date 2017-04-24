package Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		System.out.println(Arrays.toString(genFibonacci(count)));

	}

	private static int[] genFibonacci(int count) {
		
		int[] result = new int[count];
		result[0] = 0;
		result[1] = 1;

		for (int i = 2; i < count; i++) {
			result[i] = result[i-2] + result[i-1];
		}
		
		return result;
	}

}
