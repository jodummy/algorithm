package test;

import java.util.Arrays;

public class PersonSort {
	static void swap(String[] a, int i, int j) {
		String temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	static int findMin(String[] a, int start) {
		String minValue = a[start];
		int minIndex = start;
		for (int i = start + 1; i < a.length; ++i) {
			if (a[i].compareTo(minValue) < 0) {
				minValue = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

	static void selectionSort(String[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i);
			swap(a, i, minIndex);
		}
	}

	static void insertSort(String[] a) {
		for (int i = 1; i < a.length; i++) {
			String nextNum = a[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (a[j].compareTo(nextNum) > 0)
					a[j + 1] = a[j];
				else
					break;
			}
			a[j + 1] = nextNum;
		}
	}

	static void bubbleSort(String[] c) {
		for (int i = c.length - 1; i >= 1; --i) {
			for (int j = 0; j < i; j++) {
				if (c[j].compareTo(c[j + 1]) > 0)
					swap(c, j, j + 1);
			}
		}
	}

	public static void main(String[] args) {
		String[] a = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		String[] b = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		String[] c = { "zero", "one", "two", "three", "four", "five", "six", "seven" };
		selectionSort(a);
		insertSort(b);
		bubbleSort(c);
		System.out.println("select" + Arrays.toString(a));
		System.out.println("insert" + Arrays.toString(b));
		System.out.println("bubble" + Arrays.toString(c));
	}

}
