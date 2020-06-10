import java.io.*;
import  java.util.*;
class SumOfSumsOfDigits
{
public int sumOfSumsOfDigits(int input1)
{
	String n = String.valueOf(input1);
	int s = 0;
	for (int i = 0; i < n.length(); i++)
	{
		for (int j = i; j < n.length(); j++)
		{
                	s+= Integer.parseInt(String.valueOf(n.charAt(j)));
		}
	}
	return s;
}
}
