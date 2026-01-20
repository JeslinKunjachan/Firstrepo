package inheritance;

public class Multilevelchild extends MultiLevelIntermediate {
	public void div()
	{
		int d=10;
		int s=2;
		int w=d/s;
		System.out.println("Division:" +w);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multilevelchild obj = new Multilevelchild();
obj.div();
obj.mul();
obj.sum();

	}

}
