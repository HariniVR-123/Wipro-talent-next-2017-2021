import java.io.*;
import java.util.*;
class UserMainCode
{
	public int AddSub(int input1,int input2)
	{
		int X = input1;
		int r = X;
		int v = 0;
		if (input2 == 1)
			v = 1;
		else 
			v = 0;
		for (int i = X- 1, j = 0; i >= 1; i--, j++) 
		{
			if (j % 2 == v) 
				r += i;
			else
				r -= i;
			System.out.println(r + " ");
		}
		return r;
	}
}
