import.java.io.*;
import java.io.util;
class UserMainCode
{
	public String addNumberstrings(String input1,String input2)
	{
		BigDecimal x = new BigDecimal(input1);
		BigDecimal y = new BigDecimal(input2);
		return String.valueOf(x.add(y));
	}
}
