package Superkeyword;

public class SuperMethodChild extends SuperMethod

{
	
	public void display()
	{
		
		System.out.println("This is the child class");
		super.display();

}	

	public static void main(String[] args)
	{
		SuperMethodChild obj= new SuperMethodChild();
		obj.display();
	}

}
