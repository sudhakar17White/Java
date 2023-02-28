import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int row=s.nextInt();
		int col=s.nextInt();
		
		int mat[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{ 
		    
		    for(int j=0;j<col;j++)
		    { 
		        
		        mat[i][j]=s.nextInt();
		        
		    }
		    
		}
			
		for(int i=0;i<row;i++)
		{ 
		    
		    for(int j=0;j<col;j++)
		    { 
		        
		        System.out.print(mat[i][j]+" ");
		        
		    }
		    System.out.println("\n");
		        
		}
		
		int tot=0;
		int k=s.nextInt();
		int row1=row-k;
		int col1=col-k;
		
		
		
		for(int i=row1;i<row;i++)
		{ 
		    for(int j=col1;j<col;j++)
		    { 
		        
		        //System.out.print(mat[i][j]+" ");
		        tot=tot+mat[i][j];
		        
		    }
		    
		}
		System.out.println(tot);
	    
	}
}
