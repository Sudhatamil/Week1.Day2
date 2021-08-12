package Week1.Day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
char[] splitc=str.toCharArray();
for (int i = 0; i < splitc.length; i++) {
	for (int j = 0; j < splitc.length; j++) {
		if(splitc[i]!=' '&&splitc[i]==splitc[j])
		{
			count++;
		}
	}
	if(splitc[i]!=' ')
	System.out.println(splitc[i]+":"+count);
	count=0;	
}
}

}
