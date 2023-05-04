/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package data_mining;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author sudhakar
 */
public class K_Means{
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size :");
		int size=s.nextInt();
		
		int x[]=new int[size];
		int y[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter X :"+i+" :");
			x[i]=s.nextInt();
			System.out.println("Enter Y :"+i+" :");
			y[i]=s.nextInt();
			
		}
		System.out.println("Find 2 Culster only-->");
		int culs1[]=new int[2];
		int culs2[]=new int[2];
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter X :"+i+1+" :");
			culs1[i]=s.nextInt();
			System.out.println("Enter Y :"+i+1+" :");
			culs2[i]=s.nextInt();
			
		}
		int xans[]=new int[size];
		int c1=culs1[0];int c2=culs2[0];
		for(int i=0;i<size;i++)
		{
			int d1=x[i];int d2=y[i];
			int t1=(c1-d1);
			t1=t1*t1;
			int t2=(c2-d2);
			t2=t2*t2;
			int tot=t1+t2;
			System.out.println(i+1+"->"+tot);
			tot=(int) Math.sqrt(tot);
			xans[i]=tot;
			
		}
		System.out.println(Arrays.toString(xans));
		
		int yans[]=new int[size];
		int cr1=culs1[1];int cr2=culs2[1];
		for(int i=0;i<size;i++)
		{
			int d1=x[i];int d2=y[i];
			int t1=(cr1-d1);
			t1=t1*t1;
			int t2=(cr2-d2);
			t2=t2*t2;
			int tot=t1+t2;
			System.out.println(i+1+"->"+tot);
			tot=(int) Math.sqrt(tot);
			yans[i]=tot;
			
		}
		System.out.println(Arrays.toString(yans));
		
		System.out.println("Comppareing with x and y And Gruoping");
		
		char grp[]=new char[size];
		for(int i=0;i<size;i++)
		{
			if(xans[i]<yans[i])
			{
				grp[i]='1';
			}
			else
			{
				grp[i]='2';
			}
			
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(grp[i]+" ");
		}
		
		
		System.out.println("\nCentroiod Calucation");
		int cen1[]=new int[2];
		int cen2[]=new int[2];
		int co=0,h1=0,h2=0;
		for(int i=0;i<size;i++)
		{
			if(grp[i]=='1')
			{   
				h1=h1+x[i];
				h2=h2+y[i];
				co++;
			}
			
		}
		cen1[0]=h1/co;
		cen1[1]=h2/co;
		
		co=0;h1=0;h2=0;
		for(int i=0;i<size;i++)
		{
			if(grp[i]=='2')
			{   
				h1=h1+x[i];
				h2=h2+y[i];
				co++;
				
			}
			
		}
		cen2[0]=h1/co;
		cen2[1]=h2/co;
		
		
		
		System.out.println("C1-->"+Arrays.toString(cen1));
		System.out.println("C2-->"+Arrays.toString(cen2));
		
		
	}
	
}
