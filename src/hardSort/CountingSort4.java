package hardSort;

import java.util.Arrays;

import java.util.Arrays;

public class CountingSort4 {
	public static void countingSort(Person[] a) {
		Person[] p = new Person[a.length];

		int ���� = 0;
		int ���� = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].getSex().equals("����"))
				++����;
		}
		for (int i = 0; i < p.length; i++) {
			if (a[i].getSex().equals("����"))
				p[����++] = a[i];
			else
				p[����++] = a[i];
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
		Person[] a = { new Person("ȫ�浿", "����", "O"), new Person("����ġ", "����", "A"), new Person("������", "����", "AB"),
				new Person("�̸���", "����", "D"), new Person("��û", "����", "O"), new Person("�Ӳ���", "����", "A"),
				new Person("ȫ�浿", "����", "O"), new Person("����ġ", "����", "A"), new Person("������", "����", "AB"),
				new Person("�̸���", "����", "D"), new Person("��û", "����", "O"), new Person("�Ӳ���", "����", "A") };
		countingSort(a);
		System.out.println(Arrays.toString(a));
	}
}