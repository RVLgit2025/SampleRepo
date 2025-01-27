package inheritance;

public class multilevelchildC extends multilevelparentB

{
	public void display2()
	{
		System.out.println("Print all");
	}
	
	public static void main(String args[])

	{
		multilevelchildC obj=new multilevelchildC();
		obj.display();
		obj.display1();
		obj.display2();
	}
}
	
