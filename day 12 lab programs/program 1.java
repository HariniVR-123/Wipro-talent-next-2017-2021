import java.io.*;
import  java.util.*;
class UserMainCode 
{
	public int sumOfNonPrimeIndexValues(int[] input1,int input2)
	{
		int s = 0;
		for (int i = 0; i < input2; i++)
		{
			if (!isPrime(i))
			{
				System.out.print(i + ":: " + input1[i] + " ");
				s += input1[i];
			}
		}
		return s;
	}
	public static boolean isPrime (int input1)
	{
		if (1 == input1 || 0 == input1) 
			return false;
		for (int i = 2; i < input1; i++)
		{
			if (i == input1) continue;
			if (input1 % i == 0) 
			{
				return false;
			}
		}
		return true;
	}
}
