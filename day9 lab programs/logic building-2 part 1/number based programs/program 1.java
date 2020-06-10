import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int sumOfPowerOfDigits(int input1)
	{
      		if(input1>9)
		{
			int s=0;
			while(input1!=0)
			{
				int x = input1%10;
				input1 /= 10;
				int y = input1 %10;
				s += Math.pow(y, x);
			}
			return s+1;
		}
		return 0;
	}
}
