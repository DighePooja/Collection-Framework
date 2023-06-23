package Hashset_IC;

import java.util.HashSet;

public class Example3 
{
   public static void main(String[] args) 
   {
	HashSet<Integer> hs=new HashSet<Integer>();
	
	hs.add(101);
	hs.add(102);
	hs.add(103);
	hs.add(104);
	hs.add(105);
	hs.add(106);
	hs.add(107);
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	
	
	for(Integer s1 : hs)
	{
		System.out.println(s1);
	}
   }
}
