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
public Result simpleEncodedArray(int[] input1, int input2)
{
	int s=0;
	int[] a = new int[input2];
	int j = input2-1;
	a[input2-1] = input1[input2-1];
	for(int i=input2-2;i>=0;i--)
	{
		a[i] = input1[j-1]-a[i+1];
		j--;
	}
	for(int i=0;i<input2;i++)
		s += a[i];
	Result r = new Result(a[0],s);
		return r;
    }
}
