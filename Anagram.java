package Week1.Day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		char[] firstword = text1.toCharArray();
		Arrays.sort(firstword);
		String text2 = "potss";
		char[] secondword = text2.toCharArray();
		Arrays.sort(secondword);
		String res1 = String.valueOf(firstword);
		String res2 = String.valueOf(secondword);
		if (res1.equalsIgnoreCase(res2))
			System.out.println("Given String is anagram");

	}

}
