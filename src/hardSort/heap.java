package hardSort;

import java.util.Arrays;

public class heap {
	static int num = 1;

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		System.out.println((num++) + ".num :" + Arrays.toString(a));
	}

	static void buildHeap(int[] a) {
		int end = a.length - 1;
		for (int i = (end - 1) / 2; i >= 0; --i) {
			heapify(a, i, end);
		}
	}

	static void heapify(int[] a, int i, int end) {
		int left = 2 * i + 1, right = 2 * i + 2;
		int smaller;
		if (right <= end)
			smaller = (a[left] < a[right]) ? left : right;
		else if (left <= end)
			smaller = left;
		else
			return;
		System.out
				.println("end :" + end + " i :" + i + " left : " + left + " right : " + right + " smaller :" + smaller);
		if (a[smaller] < a[i]) {
			System.out.println("1.swap");
			swap(a, smaller, i);
			heapify(a, smaller, end);
		}
	}

	static void heapSort(int[] a) {
		buildHeap(a);
		for (int end = a.length - 1; end >= 1; --end) {
			System.out.println("2.swap");
			swap(a, 0, end);
			heapify(a, 0, end - 1);
		}
	}

	public static void main(String[] args) {
		int[] a = { 3, 8, 2, 10, 4 };
		heapSort(a);
	}
}