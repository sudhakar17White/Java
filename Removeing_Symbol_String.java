import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		String input=s.nextLine();
		
	    String tot = input.replaceAll("[()]", ""); 
		System.out.println(tot);
		
	}
}
