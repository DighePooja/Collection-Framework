package Hashset_IC;

import java.util.ArrayList;
import java.util.HashSet;

public class Example2 
{
   public static void main(String[] args) 
   {
	   ArrayList al=new ArrayList ();
		  
		  al.add("pooja"); 
		  al.add(101);   
		  al.add(95.5f); 
		  al.add(null); 
		  al.add(null);
		  al.add('A'); 
		  al.add("");
		  al.add(84210755330l); 
		  al.add('A');
		  
		System.out.println(al);
		  
	    HashSet hs=new HashSet(al);
	    System.out.println(hs);
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
