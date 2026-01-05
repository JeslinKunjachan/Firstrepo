package stringpackage;

public class Stringexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Jeslin";
		System.out.println(a);
		String b= new String("Ann");
		System.out.println(b);
		String c= new String("maryann");
		String d= new String("KUNJACHAN");
		String e= new String("");
//length method-to find the length of the string.
		System.out.println(a.length());
		//charAt()--to return the character of the string
		System.out.println(a.charAt(3));
		//concat()--- to add two strings
		System.out.println(a.concat(b));
		//contains()-- to check if character or word present in string
	    System.out.println(a.contains(b));
	    System.out.println(a.contains("s"));
	    //to uppercase
	    System.out.println(c.toUpperCase());
	    //to lowercase
	    System.out.println(d.toLowerCase());
	    //isEmpty--to check whether a string is empty or not
	    System.out.println(c.isEmpty());
	    System.out.println(e.isEmpty());
	    String f = "Jeslin";
	    String g = "jeslin";
	    //equals()to check if two string is equal or not
	    System.out.println(a.equals(f));
	    System.out.println(f.equals(g));
	    //equalsIgnoreCase() to ignore case
	    System.out.println(f.equalsIgnoreCase(g));
	    System.out.println(a==f);
	    String i= new String("Jeslin");
	    System.out.println(i.equals(a));
	    System.out.println(i==a);
	    //equals(==)operator compare object reference, doesnot compare the value
	    //equals method only compare value
	    String j= new String("Jeslin");
	    System.out.println(i.equals(j));
	    System.out.println(i==j);
	    //valueOf() to convert any data type to String
	    int k =6;
	    System.out.println(String.valueOf(k));
	    //trim()- to remove leading (first) and trailing(last) white spaces from a string,doesnot remove spacing between words
	    String l= " I am a student";
	    System.out.println(l.trim());
	    //subString()- to extract a part of a string
	    System.out.println(l.substring(9, 15));
	    System.out.println(l.substring(3));
	}}
