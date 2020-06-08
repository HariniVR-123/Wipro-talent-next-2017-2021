import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int evenOrOddDigitsSum(int input1,String input2)
	{
		int odd=0,even=0;
   		while(input1!=0)
    		{
        		int rem=input1%10;
        		if(rem%2==0)
        		{
            			even=even+rem;
        		}
        		else
        		{
           			 odd=odd+rem;
        		}
        		input1/=10;
    		}
    		if(input2.equalsIgnoreCase("even"))
    		{
        		return even;
		}
    		else
    		{
        		return odd;
    		}
	}
}
