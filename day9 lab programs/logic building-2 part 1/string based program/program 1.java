import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int findStringCode(String input1)
  {
	String[] s = input1.split(" ");
	StringBuffer output = new StringBuffer();
	for (String word : s)
   	{
		int sum = 0;
		for (int i = 0; i < (word.length() / 2); i++)
     		{
			int j = word.length() - i - 1; 
			int lar;
			int small;
			if (letterToNo(word.charAt(i)) > letterToNo(word.charAt(j))) 
        		{
				lar = letterToNo(word.charAt(i));
				small = letterToNo(word.charAt(j));
			}
        		else
        		{
				lar = letterToNo(word.charAt(j));
				small = letterToNo(word.charAt(i));
			}
			sum += lar - small;
		}
		if (word.length() % 2 == 1)
     		{
			sum += letterToNo(word.charAt(word.length() / 2));
		}
		output.append(sum);
	}
	return Integer.parseInt(output.toString());
}
public static int letterToNo(char ch)
{
	if (ch >= 65 && ch <= 90)
		return ch - 64;
	if (ch >= 97 && ch <= 122)
		return ch - 96;
	return 0;
}
}
