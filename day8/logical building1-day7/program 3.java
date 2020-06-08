import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int uniqueDigitsCount(int input1)
	{
		ArrayList<Integer> x=new ArrayList<Integer>(10);
		int count=0,rem;
		while(input1!=0)
		{
			rem=input1%10;
			if(!x.contains(rem))
			{
				x.add(rem);
				count++;
			}
			input1=input1/10;
		}
		return count;
	}
}
