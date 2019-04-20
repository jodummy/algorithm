package hardSort;

import java.util.Arrays;

public class countSort {
	private static void countSord(char[] a) {
//		int[] counts = new int['z' - 'a' + 1];
//		for (int i = 0; i < a.length; i++)
//			++counts[a[i] - 'a'];
//
//		int index = 0;
//
//		System.out.println(Arrays.toString(counts));
//		for (int i = 0; i < counts.length; i++) {
//			for (int j = 0; j < counts[i]; j++) {
//				a[index++] = (char) (i + 'a');
//			}
//		}

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '0')
				count++;
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = i < count ? '0' : '1';
		}

	}

	public static void main(String[] args) {
		char[] a = "010101".toCharArray();
		countSord(a);
		System.out.println(Arrays.toString(a));
	}
}