package Demo;

public class Wordcount {
public static void main(String[] args) {
	
	String aa = "Please free to contact us anytime";
	int a = 1;
	for(int i =0; i<aa.length();i++)
	{
		if(aa.charAt(i) == ' ')
				a++;
		}
	System.out.println(a);
	System.out.println(aa.length());
	}
}
