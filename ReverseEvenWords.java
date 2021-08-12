package Week1.Day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		String[] splitstr=test.split("\s");
		for (int i = 0; i < splitstr.length; i++) {
	
		if((i+1)%2==0) {		
			for(int index=splitstr[i].length()-1;index>=0;index--) {
				System.out.print(splitstr[i].charAt(index));
			}	
			System.out.print(" ");
	}
		else
		{
			System.out.print(splitstr[i]+" ");
		}
	}
	}
}


