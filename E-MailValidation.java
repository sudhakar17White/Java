import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the email:");
		String email=s.nextLine();
	    
	    //notu123@gmail.Com
	    
	    int size=email.length();
	    
	    int si=size-3;
	    
	    String com=email.substring(si);
	    
	    String check1="";
	    String check2="";
	    String c1="";
	    String c2="";
	    int i=0,count=0;
	   
	    for(i=0;i<size;i++)
	    { 
	        char a=email.charAt(i);
	        
	        c1=c1+a;
	        
	       
	        
	        if(c1.equals("@"))
	        { 
	           
	            
	            check1=email.substring(0,i+1);
	            count++;
	            System.out.println("@ valid ");
	        int end=i+1;
	            
	           for(int j=i;j<size;j++)
	            {
	           
	            char b=email.charAt(j);
	            
	            c2=c2+b;
	            
	            
	      
	            
	            if(c2.equals("."))
	            { 
	               
	              
	                check2=email.substring(end,si);
	                System.out.println(". valid ");
	                count++;
	                
	                if(com.equals("com"))
	                {
	                    System.out.println(".com valid");
	                    count++;
	                    
	                }
	                
	            }
	            c2="";
	           
	           
	            }
	            
	        }
	        c1="";
	        
	        
	        
	    }
	    if(count==3)
	    { 
	        
	        System.out.println("Email sucessfully valid..");
	        
	    }
	    else
	    { 
	        
	        System.out.println("Not valid email please check it ");
	        
	    }
	    
	  
	  
	}
}
