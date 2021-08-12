package Week1.Day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		int len = data.length;
		System.out.println("SecondLargestNumber:" + data[len-2]);
	}
}