package main;

public class Quiz4 {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 8, 10 };
		int[] arr2 = { 2, 4 };

		System.out.println("첫번째 배열의 합계 : " + sum_arr(arr1));
		System.out.println("두번째 배열의 합계 : " + sum_arr(arr2));

	}

	public static int sum_arr(int[] arr) {

		if (arr.length < 3) {
			return -999;
		}

		else {

			int sum = 0;

			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}

			return sum;
		}
	}
}
