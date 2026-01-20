package inheritance;

public class Childclass extends Singleparent{

	public void sub()
	{
		int t=5;
		int r=2;
		int e=t-r;
		System.out.println("Sub:" +e);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass obj = new Childclass();
		obj.add();
		obj.sub();
	}

}
