package core;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			StringBuffer sb=new StringBuffer("c++");
			System.out.println("Length"+sb.length());
			System.out.println("capacity"+sb.capacity());
			System.out.println(sb.charAt(0));
			
			sb.setCharAt(0, 'j');
			System.out.println(sb);
			
			StringBuffer sb1=new StringBuffer("india");
			System.out.println(sb1);
			System.out.println(sb1.reverse());
			
			StringBuffer sb2=new StringBuffer("java progarmming");
			System.out.println(sb2);
			
			sb2.replace(0,4,"c");
			System.out.println(sb2);
		}
	}

}
