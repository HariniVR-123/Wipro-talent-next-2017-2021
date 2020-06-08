import java.io.*;
import  java.util.*;
class UserMainCode
{
public int isPalindrome(String input1)
{
	String r="";
	for(int i=input1.length()-1;i>=0;i--)
	{
		r+=input1.charAt(i);
	}
	if(r.equalsIgnoreCase(input1))
	{
		return 2;
	}
	else
	{
		return 1;
	}
}
}
