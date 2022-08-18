package Multilevelinheritence;

public class Grandchild {
int salary = 0;
	
	public Grandchild(String n, int a, int s) {
		super(n,a);
		salary = s;
	}
	public void show_salary() {
		System.out.println(" Salary is "+ salary);
	}
	public void show_parent() {
		// TODO Auto-generated method stub
		
	}
}
