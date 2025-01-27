package Superkeyword;

public class SuperVariablechild extends supervariable
{

	String colour = "Blue";


public void display()

{

	System.out.println(colour);
	System.out.println(super.colour);
}

	
	public static void main(String[] args) 
	
	{
		SuperVariablechild obj =new SuperVariablechild();
	    obj.display();
	}

}
