package superkeyword;

public class superconstructorchild extends superconstructorparent {

	public superconstructorchild()
	{
		super();
		System.out.println("Ann");
	}
	public superconstructorchild(int a,float b)
	{
		super(5,4);
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		superconstructorchild obj= new superconstructorchild();
		//superconstructorparent obj1 = new superconstructorparent();
		superconstructorchild obj2= new superconstructorchild(8,3.6f);
	}
	

}
