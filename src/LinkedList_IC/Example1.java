package LinkedList_IC;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1 
{
   public static void main(String[] args) 
   {
	    LinkedList ll=new LinkedList();
	    
	    ll.add("pooja");
	    ll.add(999);
	    ll.add('A');
	    ll.add(99.9f);
	    ll.add(9999999999999l);
	    ll.add(null);
	    ll.add("pooja");
	    
	    System.out.println(ll.get(1));
	    System.out.println(ll.remove(2));
	    System.out.println(ll.set(5, "DP"));
	    System.out.println(ll.size());
	    System.out.println(ll.contains(null));
	    System.out.println(ll.isEmpty());
	    System.out.println(ll);
	    System.out.println("----------");
	    //Approaches to fetch the data of LinkedList IC
	    
	    Iterator itr=ll.iterator();
	    
	    while(itr.hasNext())
	    {
	       System.out.println(itr.next());	
	    }
	    System.out.println("----------");
	    
	    ListIterator litr=ll.listIterator();
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    System.out.println("----------");
	    for(int i=0; i<=ll.size()-1;i++)
	    {
	    	System.out.println(ll.get(i));
	    }
	    System.out.println("----------");
	    for(Object s1 : ll)
	    {
	    	System.out.println(s1);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
   }
}
