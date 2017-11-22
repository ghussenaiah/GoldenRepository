package test;

import org.apache.commons.lang3.StringUtils;

public class NullOperation {
	
	public static void main(String args[])
	{
		
	/*	String empty="";
		String nu=null;
		if(empty!=nu)
		{
			System.out.println("true");
		}
		//String abc=new String();

	}*/
		//System.out.println(this);
		
		String test =  "This is a 'sentence'";
		String lastWord = test.substring(test.lastIndexOf(" ")+1);
		lastWord = lastWord.replaceAll("\'","");
		if(lastWord.equalsIgnoreCase("sentence")){
		System.out.println(lastWord);
		}
		String check="duplicate entry for '1970-01-01 10:30' key 'time'";
		check = check.replaceAll("\'","");
		
		check = check.replaceAll("([0-9]{4})-([0-9]{2})-([0-9]{2})", "");
		System.out.println(check);
		String date="&12/12/2017jkjadsafjhsdgfjhdsgfj657  567567htrtutyurtyuryu urjhgyfasdytasfdgh hgasccrfhgaerfewahrfhwyerfwr";
		if(date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
		{
			System.out.println("success");
		}
		
	
	}

}
