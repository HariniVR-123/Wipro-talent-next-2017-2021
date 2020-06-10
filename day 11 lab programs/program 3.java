import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int findPassword(int input1, int input2,int input3, int input4,int input5)
	{
    		int x1 = input1 +input2 +input3 +input4 +input5;
		int x2 =sum(input1)+sum(input2)+sum(input3)+sum(input4)+sum(input5);
		int x3 = x1-x2;
		return x2-x3;
	}
	public static int sum(int x)
	{
		int m=x;
		int[] a1 = new int[10];
		int k=0;
		while(n!=0)
		{
			int r = x%10;
			a1[r]++;
			if(a1[r]>0)
				k=a1[r];
			x /= 10;
		}
		for(int j=0;j<10;j++)
		{
			if(a1[j]==0 ||a1[j]==k)
				continue;
			else
				return 0;
		}
		return m;
	}
}
