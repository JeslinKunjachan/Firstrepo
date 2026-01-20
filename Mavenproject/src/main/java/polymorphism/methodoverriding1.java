package polymorphism;

public class methodoverriding1 extends methodoverriding2{


	
	public void sum()
	{
	System.out.println("sum:" +(a-b));
	super.sum();
	
	}
	public void sub(int c,int d) {
	System.out.println("sub:"+(c*d));
	super.sub(6, 3);
	}

	@Override
	public void div(int e, int f) {
		// TODO Auto-generated method stub
		super.div(e, f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverriding1 obj =new methodoverriding1();
		obj.sum();
		obj.sub(6,3);
		obj.div(9, 3);
	}

}
