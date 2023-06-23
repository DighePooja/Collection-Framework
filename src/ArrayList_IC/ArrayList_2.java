package ArrayList_IC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_2    //Methods of ArrayList
{
   public static void main(String[] args) 
   {
	  ArrayList al=new ArrayList ();
	  
	
	  al.add("pooja"); 
	  al.add(101);   
	  al.add(95.5f); 
	  al.add(null); 
	  al.add('A'); 
	  al.add("");
	  al.add(84210755330l);        //long
	   
	  System.out.println(al);            //to fetch / show the data presdent in arraylist
	  System.out.println(al.size());     //size of arraylist
	  System.out.println(al.size()-1);   //last index of arraylist
	  System.out.println(al.get(5));
	  System.out.println(al.contains("pranjal"));   ///***
	  
	  
	  System.out.println(al.set(2, "pranjal"));   //to update the value in null index
	  System.out.println(al);
	  System.out.println(al.contains("pranjal"));   ///***
	   
	  System.out.println(al.remove(5));
	  System.out.println(al);
	  
	  // System.out.println(al.isEmpty());    //1st way to cheak info present or not in the arraylist
	  boolean bn=al.isEmpty();               //2nd way
	  System.out.println(bn);
	  
	  
	  ////Diff Approaches to call the info present in ALL implementation class 
	   
	  //By Using Iterator cursor ---->Universal cursor
	  System.out.println("-------------");
	  Iterator itr=al.iterator();
	  
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	   
	  System.out.println("--------------");
	  //By Using ListIterator Cursor
	  
	   ListIterator  litr =al.listIterator();   
	     
	   while(litr.hasNext())  
	   {
		   System.out.println(litr.next());
	   }
	    
	   System.out.println("--------------");
	   //By using For loop
	   for(int i=0;i<=al.size()-1;i++)
	   {
		   System.out.println(al.get(i));
	   }
	   
	   System.out.println("---------------");
	   //By Using For Each Loop
	     
	   for(Object s1:al)  
	   {
		   System.out.println(s1);
	   }
	     
	     
	     
	     
	     
	     
	     
	   
	   
	   
	   
   }
}
