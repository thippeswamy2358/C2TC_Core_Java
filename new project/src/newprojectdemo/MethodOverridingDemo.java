package newprojectdemo;
class Bank {
	float getrateofinterest( ) {
		return 6.7f;
	}}
class SBI extends Bank
{
	@Override
	float getrateofinterest( ) {
		return 6.7f;
}
}
class HDFC extends Bank
{
	@Override
	float getrateofinterest( ) {
		return 6.5f;
}
}
class icic extends Bank
{
	@Override
	float getrateofinterest( ) {
		return 6.9f;
}
}
 public class MethodOverridingDemo {
	 public static void main(String[ ]args) {
			SBI obj = new SBI();
			System.out.println(obj.getrateofinterest());
			Bank obj1 = new HDFC();
			System.out.println(obj1.getrateofinterest());
		}
	}


