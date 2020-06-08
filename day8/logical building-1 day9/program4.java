import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int totalHillWeight
	{
		int r=input1;
		int f=input2;
		int w,totalweight=0;
		for(int i=2;i<=r;i++)
		{
			f=f+input3;
			w=f*i;
			totalweight+=w;
		}
		return totalweight+input2;
	}
}
