package pp;

import java.util.Arrays;
import java.util.Scanner;

public class TestArrays {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = in.nextInt();
			int temp = arr1[i];
			arr1[i] = mod(temp);

			// 至此全部转换成各位数和
			System.out.print(arr1[i] + " ");
		}
		// 这里不造怎么处理
		/*
		 * 从第一个开始找，第一次遇到一样的时候，标志置为false， 然后从这个数再往下找，遇到一样的数组不再增加，而是都置为-1
		 */
		System.out.println();
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (arr1[i] == arr1[j] && arr1[i] != -1 && arr1[j] != -1) {
					arr2[count] = arr1[i];
					// System.out.println(arr2[count]);
					count++;
					arr1[j] = -1;
					for (int x = j + 1; x < n - 1; x++) {
						if (arr1[i] == arr1[x])
							arr1[x] = -1;
					}
					break;
				}
			}
		}
//		System.out.println(arr2[0]);
//		System.out.println(arr2[1]);
//		System.out.println(arr2[2]);
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		// int[] arr3 = new int[]{2,4,1,7,3,5};
		// Arrays.sort(arr3);
		// for(int i = 0; i < 6; i++) System.out.print(arr3[i] + " ");

		

	}

	public static int mod(int n) {
		int yu = 0;
		while (n != 0) {
			yu = yu + n % 10;
			n = n / 10;
		}
		return yu;
	}
}
