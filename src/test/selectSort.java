package test;

import java.util.Arrays;

public class selectSort {

	static int findMin(int[] a, int start) {
		int minV = a[start];
		int minI = start;

		for (int i = start + 1; i < a.length; i++) {
			if (a[i] < minV) {
				minV = a[i];
				minI = i;
			}
		}
		return minI;
	}

	static void swap(int[] a, int i, int j) {
		int num = a[i];
		a[i] = a[j];
		a[j] = num;
	}

	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length - 1; ++i) {
			int minIndex = findMin(a, i);
			System.out.println(Arrays.toString(a));
			swap(a, i, minIndex);
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 3, 8, 0 };
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}
