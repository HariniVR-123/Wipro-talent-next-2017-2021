import java.io.*;
import  java.util.*;
class UsermainCode
{
public int getPin(int input1, int input2, int input3)
{
	int pin = 0;
	int ipt1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(2)));
	int ipt2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(2)));
	int ipt3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(2)));
	if (ipt1 < ipt2 && ipt1 < ipt3)
	{
		pin = ipt1;
	} 
	else if (ipt2 < ipt3)
	{
		pin = ipt2;
	} else 
	{
		pin = ipt3;
	}
	ipt1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(1)));
	ipt2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(1)));
	ipt3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(1)));
	if (ipt1 < ipt2 && ipt1 < ipt3)
	{
		pin = ipt1 * 10 + pin;
	} 
	else if (ipt2 < ipt3) 
	{
		pin = ipt2 * 10 + pin;
	}
	else 
	{
		pin = ipt3 * 10 + pin;
	}
	ipt1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(0)));
	ipt2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(0)));
	ipt3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(0)));
	if (ipt1 < ipt2 && ipt1 < ipt3)
	{
		pin = ipt1 * 100 + pin;
	}
	else if (ipt2 < ipt3)
	{
		pin = ipt2 * 100 + pin;
	}
	else 
	{
		pin = ipt3 * 100 + pin;
	}
	int maxOfAll = 0;
	for (int i = 0; i < 3; i++)
	{
		ipt1 = Integer.parseInt(String.valueOf(String.valueOf(input1).charAt(i)));
		ipt2 = Integer.parseInt(String.valueOf(String.valueOf(input2).charAt(i)));
		ipt3 = Integer.parseInt(String.valueOf(String.valueOf(input3).charAt(i)));
		if (ipt1 > ipt2 && ipt1 > ipt3)
		{
			maxOfAll = ipt1 > maxOfAll ? ipt1 : maxOfAll;
		} 
		else if (ipt2 > ipt3) 
		{
			maxOfAll = ipt2 > maxOfAll ? ipt2 : maxOfAll;
		} 
		else 
		{
			maxOfAll = ipt3 > maxOfAll ? ipt3 : maxOfAll;
		}
	}
        pin = maxOfAll * 1000 + pin;
	return pin;
}
}
