import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int num=s.nextInt();
		
		int t=num/2;
		
		int flag=0;
		int ch=0;
		
		for(int i=2;i<=t;i++)
		{ 
		    
		    if(num%i==0)
		    { 
		        
		        //System.out.println(i);
		        flag=1;
		        break;
		    }
		    
		    
		}
		if(flag==0)
		{ 
		    
		    ch++;
		    
		}
		
		int res=0;
		
		while(num!=0)
		{ 
		    
		    int a=num%10;
		    res=(res*10)+a;
		    num=num/10;
		}
		
		int t1=res/2;
		
		int flag1=0;
		//int ch=0;
		
		for(int i=2;i<=t1;i++)
		{ 
		    
		    if(num%i==0)
		    { 
		        
		        //System.out.println(i);
		        flag=1;
		        break;
		    }
		    
		    
		}
		if(flag1==0)
		{ 
		    
		    ch++;
		    
		}
		if(ch==2)
		{ 
		    System.out.println("twisted");
		    
		}
		
	    
	}
}
