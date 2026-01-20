package superkeyword;

public class supermethod1 extends superparentmethod{
	public void dif()
	{
		int a=10;
		int v=2;
		int s =a-v;
		System.out.println(s);
		super.display();
		//super.display1();
		this.display2();
	}
public void display2()
{
	System.out.println("hello world");
	super.display1();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    supermethod1 obj= new supermethod1();
    obj.dif();
   // obj.display();
	}

}
