package Task_1;
import java.util.*;
public class CountString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String: ");
		String str=sc.nextLine();
		count(str);
	}
	public static void count(String s)
	{
		int digits=0, alps=0,sp_ch=0,vowels=0,wrds=1;
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				alps++;
				if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U' || ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				{
					vowels++;
				}
			}
			else if(Character.isDigit(ch[i]))
			{
				digits++; 
			}
			else if(ch[i]==' ')
			{
				wrds++;
			}
			else
			{
				sp_ch++;
			}
		}
		System.out.println("Count IN String:");
		System.out.println("No. of alphabets:"+alps);
		System.out.println("No. of Digits:"+digits);
		System.out.println("No. of Vowels:"+vowels);
		System.out.println("No. of Words:"+wrds);
		System.out.println("No. of Special Characters:"+sp_ch);
	}

}
