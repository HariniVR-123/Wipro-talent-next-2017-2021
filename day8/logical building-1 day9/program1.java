import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int palindromeOrNot(int input1)
	{
		int s=0,t,rem;
		t=input1;
		while(input1>0)
		{
			rem=input1%10;
			s=(s*10)+rem;
			input1/=10;
		}
		if(t==s)
		{
			return 2;
		}
		else
		{
			return 1;
		}
		
	}
}
