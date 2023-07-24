package coreJavaAssignments;

import java.util.*;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 46, 47 };

		System.out.println("Array before sorting: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Array after sorting: " + Arrays.toString(arr));

		System.out.println("Enter the number to search in array: ");
		int numToSearch = sc.nextInt();

		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == numToSearch) {
				found = true;
				System.out.println("Number found in the array at position " + i);
				break;
			}
		}

		if (!found) {
			System.out.println("Number is not present in the array");
		}
	}

}
