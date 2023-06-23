package ArrayList_IC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_3 
{
    public static void main(String[] args) 
    {
	   ArrayList al=new ArrayList();
	   
	   al.add("pd");
	   al.add(109);
	   al.add(77.7f);
	   al.add('A');
	   al.add("");
	   al.add(null);
	   al.add(109);
	   
	   System.out.println(al);
	   System.out.println(al.size());
	   System.out.println(al.size()-1);
	   System.out.println(al.get(1));
	   //System.out.println(al.remove(2));
	   System.out.println(al);
	   System.out.println(al.isEmpty());
	   System.out.println(al.contains(109));
	   System.out.println(al.set(4, "pooja"));
	   System.out.println(al);
	   System.out.println("------------");
	 //Approaches to print all data from IC
	   
	   Iterator itr=al.iterator();
	   
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   System.out.println("------------");
	   
	   ListIterator litr=al.listIterator();
	   
	   while(litr.hasNext())
	   {
		   System.out.println(litr.next());
	   }
	   System.out.println("-------------");
    	
	   for(int i=0; i<=al.size()-1;i++)
	   {
		   System.out.println(al.get(i));
	   }
	   System.out.println("-------------");
       
	  
    	
    	 
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
