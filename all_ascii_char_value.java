//Q15. Write a java program to print all ASCII characters with their values.
import java.util.*;
public class all_ascii_char_value
{
	public static void main(String x[])
	{
		char ch='a';
		
		while((ch >= 'a') && (ch <= 'z'))
		{
			System.out.println(ch + " = " + (int)ch);
			ch++;
		}
	}
}