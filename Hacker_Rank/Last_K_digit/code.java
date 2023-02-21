import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String number=s.nextLine();
		
		int size=number.length();
		
		int pr=s.nextInt();
		
		if(pr>0)
		{
		
		int tot=size;
		
		for(int i=0;i<size;i++)
		{
		    
		    if(pr==tot)
		    { 
		        System.out.println(number.substring(i,size));
		        break;
		        
		    }
		    else
		    { 
		        
		        tot--;
		        
		    }
		    
		}
	}
	else
	{ 
	    
	    System.out.println(number);
	    
	}
	    
	}
}
