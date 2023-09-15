package JavaSamples;


public class SLInherit extends Programmer
{
	String office="wipro";
	
	SLInherit()
	{
		super();
	}
	
	
	public void example()
	{
		System.out.println(super.office);
		System.out.println(office);
		
	}
	public static void main(String[] args) 
	{
		SLInherit emp1=new SLInherit();
		emp1.example();
		
	}	

}
