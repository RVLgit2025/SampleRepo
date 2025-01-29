package Encapsulation;

class Encap1 {
    // Private fields to adhere to encapsulation
    private String name;
    private int age;

    // Setter method to set name and age
    public void setter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to print name and age
    public void getter() {
        System.out.println(name + " " + age);
    }
}

public class Encap 
{
    public static void main(String[] args) {
        Encap1 obj = new Encap1();
        obj.setter("Ammu", 22); // Set name and age using setter
        obj.getter(); // Display name and age using getter
    }
}
