import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		System.out.println("Duplicate Number in Array");
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Limit:");
		
		int i,j,flag=0;
		
		int limit=s.nextInt();
		
		int ar[]=new int[limit];
		
		for(i=0;i<limit;i++)
		{ 
		    
		    
		    ar[i]=s.nextInt();
		    
		    
		}
		//print all values
		System.out.print("[");
		for(i=0;i<limit;i++)
		{ 
		    
		    
		    System.out.print(ar[i]+" ");
		    
		    
		}
		System.out.print("]\n");
		
		
		
		
		System.out.println("Duplicate number are :");	
		for(i=0;i<limit;i++)
		{ 
		    
		    for(j=i+1;j<limit;j++)
		    { 
		        
		        if(ar[i]==ar[j])
		        { 
		            
		           System.out.print(ar[i]);
		            
		        }
		        
		        
		    }    
		    
		    
		}
		
	
		
	}
}
