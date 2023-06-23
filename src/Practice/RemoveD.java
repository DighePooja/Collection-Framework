package Practice;

import java.util.HashSet;

public class RemoveD
{
   public static void main(String[] args) 
   {
	   int [] a= {2,5,3,1,7,6,8,9,5,8};
	   
	   HashSet<Integer> hs=new HashSet();
	   for(int i=0;i<=a.length-1;i++)
	   {
		   hs.add(a[i]);
	   }
	   
	   for(Integer s1 : hs)
	   {
		   System.out.println(s1);
	   }
   }
}
