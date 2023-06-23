package ArrayList_IC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_5 
{
    public static void main(String[] args) 
    {
	    ArrayList ar=new ArrayList();
	    
    	ar.add("pooja");
    	ar.add("pd");
    	ar.add(109);
    	ar.add('A');
    	ar.add(75.5f);
    	ar.add(null);
    	ar.add(109);
    	ar.add(8421075530l);
    	
    	System.out.println(ar);
    	ar.remove(1);
    	System.out.println(ar);
    	ar.set(2, 108);            //Modify the data
    	System.out.println(ar);
    	ar.add(1, 107);            //Add the data inbeetween Index
    	System.out.println(ar);
    	System.out.println(ar.isEmpty()); 
    	System.out.println(ar.contains("pd"));
    	
    	System.out.println("=======Print all data using iterator cursor=====");
    	
    	Iterator itr=ar.iterator();
    	while(itr.hasNext())
    	{
    		System.out.println(itr.next());
    	}
    	System.out.println("======print all data using List iterator cursor=======");
    	
    	ListIterator litr=ar.listIterator();
    	while(litr.hasNext())
    	{
    		System.out.println(litr.next());
    	}
    	
    	System.out.println("====== print all data using For loop =======");
    	for(int i=0;i<=ar.size()-1;i++)
    	{
    		System.out.println(ar.get(i));
    	}
    	
    	System.out.println("======print all data using For Each loop =======");    	
    	
    	for(Object ob : ar)
    	{
    		System.out.println(ob);
    	}
    	
    	
    	
    	
    	
    	
	}
}
