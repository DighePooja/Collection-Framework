package Vector_IC;

import java.util.Enumeration;
import java.util.Vector;

public class Example2 
{
    public static void main(String[] args) 
    {
	    Vector<String> v=new Vector<String>();
	    
	    v.add("mahesh");
	    v.add("ganesh");
	    v.add("ramesh");
	    v.add("paresh");
	    v.add("haresh");
	    v.add("rahul");
	    v.add("dinesh");
	    
	    System.out.println(v);
	    System.out.println(v.size());
	    System.out.println(v.get(3));
	    v.set(5, "rupesh");
	    System.out.println(v);
	    System.out.println(v.contains("haresh"));
	    System.out.println(v.remove(1));
	    System.out.println();
	    
	    System.out.println("-------fetch data of vector IC");
	    Enumeration enu=v.elements();
	    while(enu.hasMoreElements())
	    {
	    	System.out.println(enu.nextElement());
	    }
	    
	}
}
