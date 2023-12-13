package javaarray;

public class duplicateelementsinarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 1, 2, 3,7,7,10,10,10,10 };

		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && arr[j] != 0) {

					count++;

					arr[j] = 0;

				}

			}

			if (count != 1) {

				System.out.println(arr[i]);

			}

		}
	}


		
	}


