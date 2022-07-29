package week3.day2collectionassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintsDuplicatesInArrayUsingCollection {

	public static void main(String[] args) {

		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> list = new ArrayList<Integer>();
		System.out.print("Original List : ");
		list.addAll(Arrays.asList(arr));
		System.out.println(list);

		System.out.print("Sorted List   : ");
		Collections.sort(list);
		System.out.println(list);

		System.out.print("Duplicates List Element : ");
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if ((list.get(i)) == (list.get(j))) {
					System.out.print(list.get(i) + " ");
				}
			}
		}
	}
}
