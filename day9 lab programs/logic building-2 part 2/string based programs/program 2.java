import java.io.*;
import  java.util.*;
class EncodingThreeStrings
{
	public class Result
	{
		public final String op1;
		public final String op2;
		public final String op3;
		public Result(String out1, String out2, String out3)
		{
			op1 = out1;
			op2 = out2;
			op3 = out3;
		}
	}
	public Result encodeThreeStrings(String input1,String input2,String input3)
	{
    		String[] ip1parts = new String[3];
		String[] ip2parts = new String[3];
		String[] ip3parts = new String[3];
		ip1parts = getParts(input1);
		ip2parts = getParts(input2);
		ip3parts = getParts(input3);
		StringBuilder op1 = new StringBuilder (ip1parts[0] + ip2parts[0] + ip3parts[0]);
		StringBuilder op2 = new StringBuilder (ip1parts[1] + ip2parts[1] + ip3parts[1]);
		StringBuilder op3 = new StringBuilder (ip1parts[2] + ip2parts[2] + ip3parts[2]);
		for (int i = 0; i < op3.length(); i++)
		{
			if (Character.isLowerCase(op3.charAt(i)))
				op3.setCharAt(i, Character.toUpperCase(op3.charAt(i)));
			else
				op3.setCharAt(i, Character.toLowerCase(op3.charAt(i)));
		}
        	return new Result(op1.toString(), op2.toString(), op3.toString());
     	}
	public static String[] getParts(String str)
	{
		int len = str.length();
		String[] parts = new String[3];
		int partLen = len / 3;
		System.out.println("str: " + str + " len: " + len + " partLen: " + partLen);
		if (len % 3 == 0)
		{
			parts[0] = str.substring(0, partLen);
			parts[1] = str.substring(partLen, 2 * partLen);
			parts[2] = str.substring(2 * partLen, len);
			System.out.println("case 0: " + parts[0] + " " + parts[1] + " " + parts[2]);
		} 
		else if (len % 3 == 1) 
		{
			parts[0] = str.substring(0, partLen);
			parts[1] = str.substring(partLen, 2 * partLen + 1);
			parts[2] = str.substring(2 * partLen + 1, len);
			System.out.println("case 1: " + parts[0] + " " + parts[1] + " " + parts[2]);
		}
		else if (len % 3 == 2)
		{
			parts[0] = str.substring(0, partLen + 1);
			parts[1] = str.substring(partLen + 1, 2 * partLen + 1);
			parts[2] = str.substring(2 * partLen + 1, len);
			System.out.println("case 2: " + parts[0] + " " + parts[1] + " " + parts[2]);
		}
		return parts;
	}
}
