package Week1.Day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int letter = 0, space = 0, num = 0, specialChar = 0;
		char[] csc = test.toCharArray();
		for (int j = 0; j < csc.length; j++) {
			if (Character.isLetter(csc[j]))
				letter++;
			else if (Character.isDigit(csc[j]))
				num++;
			else if (Character.isSpaceChar(csc[j]))
				space++;
			else
				specialChar++;
		}

		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);

	}

}
