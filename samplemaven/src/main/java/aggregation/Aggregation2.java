package aggregation;

public class Aggregation2 {
	
	int age;
	String course;
	Aggregation1 ref;//aggregation
	
	public Aggregation2(int age,String course,Aggregation1 ref)
	{
		this.age=age;
		this.course=course;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno);
		System.out.println(age+" "+course);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 obj=new Aggregation1("revathy",30,"abc");
		Aggregation2 obj1=new Aggregation2(28,"mca", obj);
				obj1.display();
		

	}

}
