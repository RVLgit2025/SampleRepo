package Superkeyword;

public class SuperConstructorChild extends SuperConstructor

{
public SuperConstructorChild()

{

	super(5,6);
	System.out.println("Deault Constructor");
}
	
	public static void main(String[]args)
	{
		SuperConstructorChild obj= new SuperConstructorChild();//invoking constructor
		
	}

}
