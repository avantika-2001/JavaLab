package Task_1;
import java.util.*;

public class StringInfo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String1: ");
		String s1=sc.nextLine();
		System.out.println("Enter String2: ");
		String s2=sc.nextLine();
		System.out.println("Enter character:");
		String c=sc.next();
		System.out.println(s1.indexOf(c)+" "+s2.indexOf(c));
		System.out.println("Enter index:");
		int i=sc.nextInt();
		System.out.println(s1.charAt(i)+" "+s2.charAt(i));
		System.out.println("String in Upper Case:");
		System.out.println(s1.toUpperCase()+" "+s2.toUpperCase());
		System.out.println("String in Lower Case:");
		System.out.println(s1.toLowerCase()+" "+s2.toLowerCase());
		if(s1.equals(s2))
			System.out.println("Identical Strings!");
		else
			System.out.println("Non-Identical Strings!");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.substring(3,6));
	}

}
