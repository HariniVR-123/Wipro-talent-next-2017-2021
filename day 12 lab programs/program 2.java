import java.io.*;
import java.util.*;
class UserMainCode
{
	public int digitRemovePalin(int input1)
	{
		StringBuilder s = new StringBuilder(String.valueOf(input1));
		for (int i = 0; i < s.length(); i++) 
		{
			if (palindromeCheck(s.toString()))
				return -1;
			char removedChar = s.charAt(i);
			String newNum = s.deleteCharAt(i).toString();
			if (palindromeCheck(newNum))
			{
			    System.out.println(i + ":: " + newNum + " :: " + removedChar);
				return Integer.parseInt(String.valueOf(removedChar));
			}
			else
			{
				s.insert(i, removedChar);
			}				
		}
		return -1;
	}
	public static boolean palindromeCheck(String input1)
	{
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		for (int i = 0; i <= range; i++)
		{
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1))
				isPalindrome = false;
		}
		return isPalindrome;
	}
}
