import java.io.*;
import  java.util.*;
class UserMainCode
{
	public class Result
	{
  		public final int op1;
 		public final int op2;
  		public Result(int ot1,int ot2){
    		op1=ot1;
    		op2=ot2;
 	}
}
public Result decSequence(int[] input1, int input2)
{
	int c=0;
	int m1=0;
	int m2=0;
	int f=0;
	for(int i=0;i<input2-1;i++)
	{
		if(input1[i]>input1[i+1])
		{
			if(f==0)
			{
				f=1;
				c++;
			}
			m1++;
			m2=m1 > m2 ? m1:m2;
		}
		else
		{
			if(f==1)
			{
				f=0;
				m1=0;
			}
		}
	}
	if(c>0)
		m2++;
	Result r = new Result(c,m2);
		return r;
    }
}
