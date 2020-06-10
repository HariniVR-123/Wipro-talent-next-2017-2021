import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int freqOccured(int[] input1, int input2){
	int[] x = new int[10];
	for(int i=0;i<input2;i++)
	{
		count(input1[i],x);
	}
	int max=0,c=0;
	for(int i=0;i<10;i++)
	{
		if(x[i]>=max)
		{
			max=x[i];
			c=i;
		}
	}
	return c;
}
public static int[] count(int n,int ar[])
{
	while(n!=0)
	{
		int r = n % 10;
		ar[r]++;
		n /= 10;
	}
	return ar;
}
}
