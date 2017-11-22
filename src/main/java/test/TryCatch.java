package test;



public class TryCatch {
	
	public static void main(String args[])
	{
		
		int a[]={10,20,0,40,50};
		
		for(int i=0;i<a.length;i++)
		{
			try{
			int h=20/a[i];
			System.out.println(h);
			}
			catch(ArithmeticException e)
			{
					continue;
			}
			
		}
	}

}
