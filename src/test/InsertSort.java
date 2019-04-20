package test;

import java.util.Arrays;

public class InsertSort {
	static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int nextNum = a[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (a[j] > nextNum)
					a[j + 1] = a[j];
				else
					break;
			}
			System.out.println("j : " + j);
			a[j + 1] = nextNum;
			System.out.println(Arrays.toString(a));
		}
	}

	public static void main(String[] args) {
		int[] a = { 17, 14, 11, 19, 13 };
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
