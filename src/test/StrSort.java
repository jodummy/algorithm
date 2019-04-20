package test;

import java.util.Arrays;

public class StrSort {

	static void swap(char[] a, int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static void sort(char[] a) {
		int start = 0;
		int end = a.length - 1;
		while (true) {
			while (a[start] == '0' && start < end)
				start++;
			while (a[end] == '1' && start < end)
				end--;

			if (start >= end)
				break;
			swap(a, start, end);
		}
	}

	public static void main(String[] args) {
		char[] a = "010101110101".toCharArray();
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}
