import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("2D Array");
		
		Scanner s=new Scanner(System.in);
		
		int n,m,i,j;
		
		n=s.nextInt();
		m=s.nextInt();
		
		
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		
		int tot[][]=new int[n][m];
		
		System.out.println("1st Array:");
		
		for(i=0;i<n;i++)
		{ 
		    
		    for(j=0;j<m;j++)
		    { 
		        
		        
		     a[i][j]=s.nextInt();           
		        
		        
		    }
		    
		    
		}
		System.out.println("2Nd Array:");
		for(i=0;i<n;i++)
		{ 
		    
		    for(j=0;j<m;j++)
		    { 
		        
		        
		     b[i][j]=s.nextInt();           
		        
		        
		    }
		    
		    
		}
		
		System.out.println("Total Array:");
		
		
		for(i=0;i<n;i++)
		{ 
		    
		    for(j=0;j<m;j++)
		    { 
		        
		        
		     tot[i][j]=a[i][j]+b[i][j];           
		        
		        
		    }
		    
		    
		}
		
		
	
		for(i=0;i<n;i++)
		{ 
		    
		    for(j=0;j<m;j++)
		    { 
		        
		        
		      System.out.print(tot[i][j]+"\t");           
		      
		        
		    }
		    
		    System.out.println("\n"); 
		}
		
		 
		
		
		
		
	}
}
