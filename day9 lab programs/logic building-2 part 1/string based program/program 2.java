import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int codeThroughStrings(String input1)
  {
	int c=0,value=0;;
	input1=input1.toUpperCase();
	String[] a=input1.split(" ");
	for(int i=0;i<a.length;i++)
	{
		c+=a[i].length();
	}
	while(c/10!=0)
	{
		while(c!=0)
		{
			value+=c%10;
			c/=10;
		}	
		c=value;
	}
	return c;
}
}
