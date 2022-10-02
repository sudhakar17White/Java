import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner s=new Scanner(System.in);
	    
	    String input=s.nextLine();
	   
	    String number="0123456789";
	    int limit=input.length();
	    int i,j;
	    
	    char a;
	    
	 
	    
	    int tot=0;
	    for(i=0;i<limit;i++)
	    { 
	           String t="";
	        a=input.charAt(i);
	        
	        if( Character.isDigit(a))   //this line to get a single char letter to check this number is digit 
	        { 
	            int tt=0;       
	            t=t+a;
	            
	            tt=Integer.parseInt(t);
	            
	            tot=tot+tt;
	          
	            
	        }
	     
	        
	        
	    }
	    System.out.println("The Total number In a String :"+tot);
	
	
	}
}

