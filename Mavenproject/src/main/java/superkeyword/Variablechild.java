package superkeyword;

public class Variablechild extends Variableparent {
	String color ="black";
	public void display()
	{
		System.out.println(super.color);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variablechild obj = new Variablechild();
		obj.display();
		System.out.println(obj.color);
		

	}

}
