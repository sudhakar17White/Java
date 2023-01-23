
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
	    Scanner s=new Scanner(System.in);
	    
	    System.out.println("X value:");
	    String x=s.nextLine();
	    
	    System.out.println("x key value:");
	    String x_key=s.nextLine();
	    
	    //autocorolraion
	    
	    int xsize=x_key.length();
	    
	    int auto[]=new int[xsize];
	    String xsdata="";
	    
	    for(int i=0;i<xsize;i++)
	    { 
	        
	        char a=x_key.charAt(i);
	        
	        if(a=='0')
	        { 
	            auto[i]=-1;
	            
	        }
	        else if(a=='1')
	        { 
	            
	            auto[i]=1;
	            
	        }
	        
	        
	    }
	    System.out.print(Arrays.toString(auto));
	    
	    int xv=Integer.parseInt(x);
	    
	    int ans[]=new int[xsize];
	    int t=0;
	    for(int i=0;i<xsize;i++)
	    { 
	        
	        
	        int b=auto[i];
	        //System.out.println(b);
	        t=xv*b;
	        ans[i]=t;
	        
	        t=0;
	    }
	    
	    System.out.print("\n"+Arrays.toString(ans));
	    
	     System.out.println("\nY value:");
	    String y=s.nextLine();
	    
	    if(y.equals("0"))
	    { 
	        
	        y="-1";
	        
	    }
	    
	    System.out.println("Y key value:");
	    String y_key=s.nextLine();
	    
	    //autocorolraion
	    
	    int ysize=y_key.length();
	    
	    int autoy[]=new int[ysize];
	    String ysdata="";
	    
	    for(int i=0;i<ysize;i++)
	    { 
	        
	        char a=y_key.charAt(i);
	        
	        if(a=='0')
	        { 
	            autoy[i]=-1;
	            
	        }
	        else if(a=='1')
	        { 
	            
	            autoy[i]=1;
	            
	        }
	        
	        
	    }
	    System.out.print(Arrays.toString(auto));
	    
	    int yv=Integer.parseInt(y);
	    
	    int ansy[]=new int[ysize];
	    t=0;
	    for(int i=0;i<ysize;i++)
	    { 
	        
	        
	        int b=autoy[i];
	        t=yv*b;
	        ansy[i]=t;
	        
	        t=0;
	    }
	    
	    System.out.print("\n"+Arrays.toString(ansy));
	    
	    int tot[]=new int[xsize];
	    
	    for(int i=0;i<xsize;i++)
	    { 
	        
	        tot[i]=ans[i]+ansy[i];
	        
	    }
	    System.out.println("\nTotal of two");
	    System.out.println(Arrays.toString(tot));
	    
	    System.out.println("1.To get x value \n2.TO get Y value");
	    int ch=s.nextInt();
	    
	    int ti[]=new int[xsize];
	    
	    if(ch==1)
	    { 
	        int f=0;
	        for(int i=0;i<xsize;i++)
	        { 
	            
                ti[i]=ans[i]*tot[i];
                f=f+ti[i];
	            
	        }
	        
	        System.out.println("\n"+Arrays.toString(ti));
	        
	        if(f>xv)
	        { 
	            
	            System.out.println("x value is:"+xv);
	            
	        }
	        else
	        { 
	            
	            System.out.println("worng");
	            
	        }
	        
	        
	    }
	    else if(ch==2)
	    { 
	        
	        int f=0;
	        for(int i=0;i<xsize;i++)
	        { 
	            
                ti[i]=ansy[i]*tot[i];
                f=f+ti[i];
	            
	        }
	        
	        System.out.println("\n"+Arrays.toString(ti));
	        
	        if(f>yv)
	        { 
	            
	            System.out.println("Y value is:"+y);
	            
	        }
	        else
	        { 
	            
	            System.out.println("worng");
	            
	        }
	        
	        
	        
	        
	    }
	    
	    
	}
}


