import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int Nseies(int input1, int input2, int input3, int input4)
	{
    		int x1 = input2 - input1; 
		int x2 = input3 - input2;
		int a1=0;int a2=0;int a3=0;
		a1 = input1;
		for(int i=0;i<input4/2;i++)
		{
			a2 = a1 + x1;
			a3 = a2 + x2;
			if(input4%2==0)
			{
				if(i==input4/2-1)
				return a2;
			}
			else
			{
				if(i==input4/2-1)
				return a3;
			}
			a1=a3;
		}
		return 0;
	}
}
