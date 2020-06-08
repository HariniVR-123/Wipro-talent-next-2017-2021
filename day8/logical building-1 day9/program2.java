import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int isPalindromePossible
	{
		ArrayList<Integer> x=new ArrayList<Integer>(5);
		ArrayList<Integer> y=new ArrayList<Integer>(5);
		int rem,i,count=0;
		while(input1!=0)
		{
			rem=input1%10;
			if(!x.contains(rem))
			{
				x.add(rem);
				i=x.indexOf(rem);
				y.add(i, 1);
			}
			else
			{
				i=x.indexOf(rem);
				int v = y.get(i); 
				v++; 
				y.remove(i);
				y.add(i, v);
			}
			input1/=10;
		}
		for(int z:y)
		{
			if(z%2!=0)
			{
				count++;
			}
		}
		if(count<=1)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
}
