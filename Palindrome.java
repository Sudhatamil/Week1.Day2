package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "liril", reverse = "";
		int len = name.length();
		for (int i = len - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		if (name.equals(reverse)) {
			System.out.println("Given String is Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
