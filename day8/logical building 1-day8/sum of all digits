import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int allDigitSum(int input1)
	{
		int s=0;
		while(input1!=0)
		{
			s=s+input1%10;
			input1/=10;
		}
		while(s/10!=0)
		{
			input1=s;
			s=0;
			while(input1!=0)
			{
				s=s+input1%10;
				input1/=10;
			}
		}
		return s;
	}

}
