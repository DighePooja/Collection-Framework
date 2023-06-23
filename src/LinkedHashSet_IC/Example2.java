package LinkedHashSet_IC;

import java.util.LinkedHashSet;

public class Example2 
{
   public static void main(String[] args) 
   {
	  LinkedHashSet lh=new LinkedHashSet();
	  
	  lh.add("pd");
	  lh.add(101);
	  lh.add('A');
	  lh.add(null);
	  lh.add(101);
	  lh.add(102);
	  
	  System.out.println(lh);
	  System.out.println(lh.size());
	   
	  System.out.println("===========");
	   
	  for(Object s1 : lh)
	  {
		  System.out.println(s1);
	  }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
