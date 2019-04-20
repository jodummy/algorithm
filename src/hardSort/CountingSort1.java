package hardSort;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//keyset ¸Ê keyÁ¤·Ä
public class CountingSort1 {
	public static void countingSort(char[] a) {
		Map<Character, Integer> countMap = new TreeMap<>();
		for (char c : a) {
			System.out.println(c);
			System.out.println(countMap.get(c));
			Integer i = countMap.get(c);
			if (i == null)
				i = 0;
			countMap.put(c, i + 1);
			System.out.println(i);
			System.out.println();
		}
		int index = 0;
		System.out.println("       " + countMap.keySet());
		for (char c : countMap.keySet()) {
			for (int i = 0; i < countMap.get(c); ++i)
				a[index++] = c;
		}
	}

	public static void main(String[] args) {
		char[] a = "hello world. good morning. how are you.".toCharArray();
		countingSort(a);
		System.out.printf("[%s]\n", new String(a));

		Map<Character, Integer> m = new TreeMap<>();
		m.put('b', 0);
		m.put('b', 0);
		m.put('d', 0);
		m.put('c', 0);
		m.put('a', 0);
		m.put('.', 0);
		m.put('o', 0);

		
	}
}