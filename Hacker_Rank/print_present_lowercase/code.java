import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	    
	    int n=s.nextInt();
	    s.nextLine();
	    
	    String word[]=new String[n];
	    
	    for(int i=0;i<n;i++)
	    { 
	        
	        word[i]=s.nextLine();
	        
	    }
	    System.out.print(Arrays.toString(word));
	    
	    String a=word[0];
	    String b=word[1];
	    
	    String same="";
	    for(int i=0;i<a.length();i++)
	    { 
	        char ar=word[0].charAt(i);
	        
	        for(int j=0;j<b.length();j++)
	        { 
	            
	            char br=word[1].charAt(j);
	            
	            int comp=Character.compare(ar,br);
	            if(comp==0)
	            { 
	                
	                same=same+br;
	                break;
	                
	            }
	            
	            
	        }
	        
	        
	    }
	    
	    int tot=n-2;
	    if(tot>0)
	    {
	    //System.out.println(tot);
	    String fans="";
	    int g=0;
	    for(int j=0;j<same.length();j++)
	    { 
	        char bg=same.charAt(j);
	        //System.out.println(bg);
	        for(int i=2;i<n;i++)
	        { 
	            for(int k=0;k<word[i].length();k++)
	            {
	                char ag=word[i].charAt(k);
	               // System.out.println(ag);
	                int comp=Character.compare(ag,bg);
	                if(comp==0)
	                { 
	                
	                fans=fans+bg;
	                
	                
	                
	                }
	            }
	           
	            
	            
	        }
	        //tot++;
	         
	    }
	    char bn[]=fans.toCharArray();
	    Arrays.sort(bn);
	    
	    System.out.println("\n"+Arrays.toString(bn));
	    System.out.println("\n"+fans);
	   }
	   else
	   { 
	       
	       char an[]=same.toCharArray();
	       Arrays.sort(an);
	       ]==
	       System.out.print("\n"+Arrays.toString(an));
	    
	       
	   }
	    
	}
}
