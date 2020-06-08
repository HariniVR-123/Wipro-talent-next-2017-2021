import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int countPrimesInRange(int input1,int input2)
	{
		int count=0;
		boolean flag;
		for(int i=input1;i<=input2;i++)
		{
			flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;

				}
			}
			if(flag==true)
			{
				count++;
			}

		}
		return count;
	}
}
