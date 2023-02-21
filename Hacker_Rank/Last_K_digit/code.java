import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String number=s.nextLine();
		
		int size=number.length();
		
		int pr=size-s.nextInt();
		
		if(pr>0)
		{
		   System.out.println(number.substring(pr,size));
		 
		}

	    else
	    { 
	    
	    System.out.println(number);
	    
	    }
	    
	}
}
