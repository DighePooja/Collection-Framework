package Vector_IC;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example1 
{
    public static void main(String[] args) 
    {
    	 Vector v=new Vector();
    	 
    	 v.add("pooja");
    	 v.add('A');
    	 v.add(105);
    	 v.add(77.7f);
    	 v.add(8421075530l);
    	 v.add(null);
    	 v.add(null);
    	 v.add("");
    	 v.add("pooja");
    	 
    	 System.out.println(v);
         System.out.println(v.size()); 
    	 System.out.println(v.size()-1); 
    	 System.out.println(v.get(4));
//    	 v.remove(8);
//    	 System.out.println(v);
//    	 System.out.println(v.remove(1));
//    	 System.out.println(v);
    	 System.out.println(v.contains(null));
    	 v.contains("pooja");
    	 v.set(7, 109);
    	 System.out.println(v);
    	 System.out.println(v.set(5, 1712));
    	 System.out.println(v);
//    	 v.clear();
//    	 System.out.println(v);
    	 //System.out.println(v.clear());------>return type Void so can't call in printing statement
    	 System.out.println(v.isEmpty());
    	 
    	 v.add(6, "aaru");
    	 System.out.println(v);           //right shift operation
    	 
    	 v.remove(4);
    	 System.out.println(v);           //left shift operation
    	 
    	 
    	 System.out.println("-----------------");
    	 //Approaches to fetch the data from vector IC
    	 
    	 Iterator itr=v.iterator();
    	 while(itr.hasNext())
    	 {
    		 System.out.println(itr.next());
    	 }
    	  ListIterator litr=v.listIterator();
    	 
    	 while(litr.hasNext())
    	 {
    		 System.out.println(litr.next());
    	 }
    	 
    	 for(int i=0;i<=v.size()-1;i++)
    	 {
    		 System.out.println(v.get(i));
    	 }
    	 for(Object s1 : v) 
    	 {
    	    System.out.println(s1);	 
    	 }
    	 
         Enumeration enu=v.elements();
    	 
         while(enu.hasMoreElements())       	
         {
        	 System.out.println(enu.nextElement());
         }
    	 
    	 
    	
    	
    	
    	
    	
    	
    	
     
    } 
}
