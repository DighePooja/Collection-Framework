package Hashset_IC;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example1 
{
   public static void main(String[] args) 
   {
	
	   HashSet hs=new HashSet();
	   
       hs.add("pooja");
       hs.add(109);
       hs.add(99.9f);
       hs.add('A');
       hs.add(null);
       hs.add("Pooja");
       hs.add(null);
	   
	   System.out.println(hs);
	   hs.remove(109);
	   System.out.println(hs);
	   System.out.println(hs.size());
	   //hs.clear();
	   
	   LinkedHashSet lh=new LinkedHashSet(hs);
	   System.out.println(hs);

       //hs.set(1,"pd");
       //System.out.println(hs.get(109)); 
       //not applicable as data is not stored in the form of index


	   System.out.println("print all data using Iterator cursor");
	   Iterator itr= hs.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
	   System.out.println("print all data using for each loop");
	   for(Object s1 : hs)
	   {
		   System.out.println(s1);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
