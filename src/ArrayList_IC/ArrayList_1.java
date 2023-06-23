package ArrayList_IC;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_1
{
    public static void main(String[] args) 
    {
    	ArrayList al=new ArrayList();
    	
    	al.add("pooja");
    	al.add(101);
    	al.add('A');
    	al.add(null);
        al.add(77.7f);
        al.add("");
        al.add(109);
        
        //al.set(3, "akanksha");
        System.out.println(al.isEmpty());
        
        System.out.println(al.set(3, 102));
        
        System.out.println(al.contains(101));
        
        System.out.println(al.remove(2));
        
        //System.out.println(al.set(,109));
        
      System.out.println(al);
       Iterator itr = al.iterator();
//       
//       while(itr.hasNext())
//       {
//    	   System.out.println(itr.next());
//       }
//       System.out.println("-------------");
//    	
//       for(Object s1: al)
//       {
//    	   System.out.println(s1);
//       }
//    	
//     
//   
//       System.out.println(al);
//     
//       //Using for loop
//       
//       System.out.println("----------");
//       for(int i=0; i<=2; i++)
//       {
//    	   System.out.println(al.get(i));
//       }
//   	   System.out.println("----------");
//    	
    	for  (Object s1: al)
    	{
    		System.out.println(s1);
    	}
    	
//    	 while(itr.hasNext())
//          {
//        	   System.out.println(itr.next());
//          }
//    	
//    	
//    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}
