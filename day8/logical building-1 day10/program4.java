import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int mostFrequentDigits(int input1,int input2,int input3,int input4,int input5)
	{
		String s = String.valueOf(input1) + String.valueOf(input2) + String.valueOf(input3) + String.valueOf(input4);
		int[] d = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; 
		for (int i = 0; i < s.length(); i++)
		{
			d[Integer.parseInt(String.valueOf(s.charAt(i)))]++;
		}
		int mfd = 0;
		for (int i = 0; i <= 9; i++) 
		{
			mfd= d[i] >= d[mfd] ? i : mfd;
		}
		return mfd;
	}
}
