import java.io.*;
import  java.util.*;
class UserMainCode
{
	public String identifyPossibleWords(String input1,String input2)
	{
		input1 = input1.toUpperCase();
		StringBuffer op = new StringBuffer();
		String[] w = input2.split(":");
		int underscoreIndex = input1.indexOf('_');
		for (int i = 0; i < w.length; i++) 
		{
			w[i] = w[i].toUpperCase();
			if (w[i].length() >= input1.length() &&
			input1.replace('_', w[i].charAt(underscoreIndex)).equals(w[i]))
			{
				op.append(w[i]).append(":");
			}
		}
		if (op.length() == 0) 
			return "ERROR-009";
        	else 
			return op.toString().substring(0, op.length() - 1);
	}
}
