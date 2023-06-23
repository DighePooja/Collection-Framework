package LinkedHashSet_IC;

import java.util.LinkedHashSet;

public class Example1
{
   public static void main(String[] args) 
   {

		  LinkedHashSet lh=new LinkedHashSet();
		  
		  lh.add("akanksha");
		  lh.add(null);
		  lh.add(111);
		  lh.add(111.1f);
		  lh.add("");
		  lh.add(111); 
		  lh.add('A');
		 
		  System.out.println(lh); 
		  System.out.println(lh.size()); 
		  System.out.println(lh.contains("akanksha"));
		  System.out.println(lh.isEmpty());
		  lh.remove(111);
		  System.out.println(lh);
   }
}
