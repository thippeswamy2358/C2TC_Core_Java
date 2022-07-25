package core;

public class ThredDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ThreadClass t1=new ThreadClass(5000,"First");
  ThreadClass t2=new ThreadClass(3000,"second");
  t1.start();
  t2.start();
  try
  {
	  t1.join();
	  t2.join();
  }
  catch(Exception e)
  {
	  }
  }

}
