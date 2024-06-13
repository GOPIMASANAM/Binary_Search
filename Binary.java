package dataStructures;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Impact {

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);  
		 try {
		int n,i,j,low=0,high=0,mid=0,count=0,target=0,temp=0;
		  System.out.println("Enter range of Array: ");
		  n=sc.nextInt();
		  int[] s=new int[n]; 
		  System.out.println("Enter "+n+" values: ");
		   for(i=0;i<n;i++) 
			   s[i]=sc.nextInt();				    	   
		   System.out.println("Enter Target value: ");
		   target=sc.nextInt(); 
		   System.out.print("Your values:  ");
		   for(i=0;i<n;i++)
			   System.out.print(" "+s[i]); 
		       System.out.println();
		       for(i=0;i<n;i++) { 
		    	   for(j=i+1;j<n;j++) {
		    		   if(s[i]>s[j]) {
		    			   temp=s[i];
		    			   s[i]=s[j];
		    			   s[j]=temp;
		    		   }
		    	   }
		       }
		    	System.out.print("After Sorting: ");	   
		    	 for(i=0;i<n;i++)
					   System.out.print(" "+s[i]); 
				       System.out.println(); 
				       if(target<s[0] || target>s[n-1]) {
				    	 System.out.println("Your Target is "+target+" not Found.");
				       }	       
		   high=n;
		   while(low<=high) { 
			   count++;
			   mid=(low+high)/2;
			   if(target==s[mid]) { 
				 System.out.println("Target is "+target+" found after "+count+" searches.");  
				 break;
			   }
			   else if(target>s[mid]) {
				   low=mid+1;			 
        	 if(s[low]==target) {
			    System.out.println("Target is "+target+" found after "+count+" searches."); 
			      break;
			    }  
			   } 
			   else if(target<s[mid]) {
				   high=mid-1;
			   if(s[high]==target) {					
				     System.out.println("Target is "+target+" found after "+count+" searches."); 
					  break;
				   }  
			   } 
		   }
		   if(target<s[low] || target>s[high]){ 			  
		   System.out.println("Your Target is "+target+" not Found in the Array ");
		   }
		    
		  }catch(InputMismatchException ie) {
			     System.out.println("Input_Mismatch_Exception, please Enter only integers.");			   	   
          }
		   catch(Exception e) {			 			   
				
		   }	
		   sc.close();
	 }
 }
