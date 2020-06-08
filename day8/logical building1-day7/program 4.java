import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int nonRepeatingDigitsCount
	{
		int c=0;
		int[] arr={0,0,0,0,0,0,0,0,0,0};
		while(input1!=0)
		{
			int d=input1%10;
			arr[d]++;
			input1=input1/10;
		}
		for(int i=0;i<10;i++)
		{
			if(arr[i]==1)
			{
				c++;
			}
		}
		return c;
	}
}
