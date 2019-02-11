import java.io.*;
import java.util.*;
class Printstr
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int b=input.nextInt();
	for(int i=0;i<b;i++)
	{
		System.out.print(a.charAt(i));
	}	
   }
}
