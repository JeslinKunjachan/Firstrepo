package polymorphism;

public class methodoverriding2 {
	int a =2;
	int b= 3;
	public void sum()
	{
	System.out.println("sum:" +(a+b));
	
	}
	public void sub(int c,int d) {
		System.out.println("sub:"+(c-d));
	}
	public void div(int e, int f) {
		System.out.println("div:" +(e/f));
	}
}
