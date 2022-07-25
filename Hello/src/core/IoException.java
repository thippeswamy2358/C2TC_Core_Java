package core;
import java.io.IOException;
public class IoException {
	void m()throws IOException
	{
		throw new IOException("device error");
	}
	void n()throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e) {System.out.println("exception handled");}
		
	}
	public static void main(String args[])
	{	
		IoException obj=new IoException();
obj.p();
System.out.println("normal flow...");

	}

}
