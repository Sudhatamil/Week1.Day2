package Week1.Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] convertstring=test.toCharArray();
		for (int i = 0; i < convertstring.length; i++) {
			if(i%2==0)
			{
				System.out.print(Character.toUpperCase(convertstring[i]));
			}
			else
			{
				System.out.print(convertstring[i]);
			}
		}
	}

}
