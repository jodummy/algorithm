package hardSort;

import java.util.Arrays;

import java.util.Arrays;

public class CountingSort4 {
	public static void countingSort(Person[] a) {
		Person[] p = new Person[a.length];

		int 여자 = 0;
		int 남자 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].getSex().equals("여자"))
				++남자;
		}
		for (int i = 0; i < p.length; i++) {
			if (a[i].getSex().equals("여자"))
				p[여자++] = a[i];
			else
				p[남자++] = a[i];
		}

		for (int i = 0; i < p.length; i++) {
			a[i] = p[i];
		}
	}

	private static void swap(Person[] a, int i, int j) {
		Person b = a[i];
		a[i] = a[j];
		a[j] = b;
	}

	public static void main(String[] args) {
		Person[] a = { new Person("홍길동", "남자", "O"), new Person("전우치", "남자", "A"), new Person("성춘향", "여자", "AB"),
				new Person("이몽룡", "남자", "D"), new Person("심청", "여자", "O"), new Person("임꺽정", "여자", "A"),
				new Person("홍길동", "남자", "O"), new Person("전우치", "남자", "A"), new Person("성춘향", "여자", "AB"),
				new Person("이몽룡", "남자", "D"), new Person("심청", "여자", "O"), new Person("임꺽정", "여자", "A") };
		countingSort(a);
		System.out.println(Arrays.toString(a));
	}
}