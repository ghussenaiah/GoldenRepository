package test;

public class StringTrim {
	
	public static void main(String args[])
	{
		String abc="testtest";
		//String def=abc.trim();
		//String def=abc.trim();
		System.out.println("after trim        "+abc);
		
		String fgt[] =abc.split("\\_");
		System.out.println("after trim        "+abc.split("\\_")[0].toString());
		
		
	}

}
