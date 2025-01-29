package Abstraction;

public class AbstDisplay2 extends Abstractionparent
{

	@Override
	public void display() 
	{
	System.out.println("DISPLAY NEW");	
		
	}
	
	public void AbstDisplaychild()
	{
		System.out.println("DISPLAY NEW METHOD");
		
	}
	
	public static void main(String[]args)
	{
		
		AbstDisplay2 obj = new AbstDisplay2();
	//Abstractionparent obj=new AbstDisplaychild();--- reference method
		obj.AbstDisplaychild();
		obj.display();
		obj.display1();
		//obj.display2();
	}
}



