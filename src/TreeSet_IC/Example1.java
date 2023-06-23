package TreeSet_IC;

import java.util.Iterator;
import java.util.TreeSet;

public class Example1 
{
    public static void main(String[] args) 
    {
	   TreeSet<Integer> tr=new TreeSet<Integer>();
	   
	   tr.add(100);
	   tr.add(101);
	   tr.add(102);
	   tr.add(103);
	   tr.add(104);
	   tr.add(105);
	   tr.add(106);
	   tr.add(107);
	   
	   System.out.println(tr);
	   System.out.println(tr.size());
	   System.out.println(tr.isEmpty());		
	   //boolean b=tr.isEmpty();
	   //System.out.println(b);
	   tr.first();
	   tr.last();
	   tr.pollFirst();
	   tr.pollLast();
	   System.out.println(tr);
	   tr.remove(100);
	  // tr.clear();
	   System.out.println(tr);
	   
	   System.out.println("-----------Print all data-----------");
	   
	  Iterator itr=tr.iterator();
	   
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	   
	  System.out.println("-------using for each loop---------");
	  for(Integer s1 : tr) 
	  {
		  System.out.println(s1);
	  }
	   
	   
	   
	   
	   
	   
	   }
}
