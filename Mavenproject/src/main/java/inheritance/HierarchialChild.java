package inheritance;

public class HierarchialChild extends HierarchialParent{

	public void display()
	{
	System.out.println("Hello world");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HierarchialChild obj= new HierarchialChild();
obj.display();
obj.sum();
	}

}
