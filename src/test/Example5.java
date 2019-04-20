package test;

import java.util.Arrays;
import java.util.Random;

public class Example5 {
	static void swap(int[] a, int i, int j) {
		int t = a[j];
		a[j] = a[i];
		a[i] = t;
	}

	static void moveEvenNumbersToFron(int[] a) {
		int start = 0;
		int end = a.length - 1;

		while (true) {
			while (a[start] % 2 == 0 && start < end)
				start++;
			while (a[end] % 2 != 0 && start < end)
				end--;
			if (start >= end)
				break;

			swap(a, start, end);
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; ++i)
			a[i] = random.nextInt(20);
		moveEvenNumbersToFron(a);
		System.out.println(Arrays.toString(a));
	}
}