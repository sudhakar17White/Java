import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		
		int sum=0;
		
		for(int i=1;i<num;i++)
		{ 
		    if(num%i==0)
		    { 
		        
		        sum=sum+i;
		        
		    }
		    
		    
		}
	    
	    System.out.println(sum);
	    
	    if(sum<num)
	    { 
	        
	        System.out.println("Not abunted");
	    }
	    else
	    { 
	        
	        System.out.println("abunted");
	        
	    }
	    
	}
}
