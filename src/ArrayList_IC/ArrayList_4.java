package ArrayList_IC;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_4
{
    public static void main(String[] args) 
    {
	    ArrayList ar=new ArrayList();
	    
	    ar.add("pooja");
	    ar.add(109);
	    ar.add(99.9f);
	    ar.add('A');
	    ar.add(null);
	    ar.add("");
	    ar.add(8421075530l);
	    ar.add("nikita");
	    ar.add("snehal");
	    ar.add(109);
	    
	    System.out.println(ar);
	    System.out.println(ar.size());
	    System.out.println(ar.size()-1);
	    System.out.println(ar.remove(5));
	    System.out.println(ar);
	    System.out.println(ar.contains(null));
	    ar.set(5, "akanksha");
	    System.out.println(ar);
	    System.out.println(ar.get(1));
	    System.out.println(ar.isEmpty());   
	   // ar.clear();
	    
	    System.out.println("------Print data of ArrayList--------");
	    
	    Iterator itr=ar.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("----ListIterator--------");
	    ListIterator litr=ar.listIterator();
	    while(litr.hasNext())
	    {
	    	System.out.println(litr.next());
	    }
	    System.out.println("-------for Loop----------");
	    for(int i=0;i<=ar.size()-1;i++) 
	    {
	    	System.out.println(ar.get(i));
	    }
	    System.out.println("-------for each loop---------");
	    for(Object s1 : ar)
	    {
	    	System.out.println(s1);
	    }
	    
	    System.out.println("----------Call objects----------");
	    
	    HashSet hs=new HashSet(ar);
	    
	    System.out.println(hs);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
    }
}
