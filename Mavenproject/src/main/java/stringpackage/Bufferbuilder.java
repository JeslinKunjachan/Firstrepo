package stringpackage;

public class Bufferbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a= new StringBuffer("Hello");
System.out.println(a);
StringBuilder b= new StringBuilder("Hai");
System.out.println(b);
//insert()-insert new string in current string
a.insert(1, "hai");
System.out.println(a);
//append()--to add new string at last of other string
System.out.println(a.append(b));
//replace() to replace one string based on the index, starting and end position
System.out.println(a.replace(2, 5, "rain"));
//delete()--to delete based on the index, starting and end position
System.out.println(a.delete(4, 7));	
//reverse()-- to reverse a string
System.out.println(a.reverse());
	
	}

}
