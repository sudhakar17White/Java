import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    	
		//some of row and coloum
		
		//min and max of row and coloum
		
	
	    
		Scanner s=new Scanner(System.in);
    
		
		System.out.println("2D Array Calculation");
		
		int i,j;
    
        System.out.println("Enter the Row size :");
        int r=s.nextInt();
    
    
        System.out.println("Enter the Coloum size :");
        int c=s.nextInt();
        
		
        int a[][]=new int[r][c];
    
        
        //get input
        
        for(i=0;i<r;i++)
        { 
            
            for(j=0;j<c;j++)
            { 
                
                System.out.println("Enter "+(i+1)+" "+(j+1)+" Value:");
                a[i][j]=s.nextInt();
                
                
                
            }
            
            
        }
    
    
      
        //sum of rows
                
                      int sum=0;
                      for(i=0;i<r;i++)
                      { 
                           sum=0;
                            for(j=0;j<c;j++)
                            { 
                
                                
                                sum=sum+a[i][j];
                            
                                
                            }
                                System.out.println("\n Sum of "+(i+1)+" Row "+sum);
                           
            
                      }
            
            
            
     
     
  
		
	}
}
