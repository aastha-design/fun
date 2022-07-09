package basics;

import encapsulation.EncapsulationIntro;

public class MainClass {

	public static void main(String[] args) {
		
//		person p1=new person();
//		p1.age=10;
//		p1.name="aastha";
//		
//		person p2=new person(45,"rob sharma");
//		
//		p1.walk(2);
//		p2.eat();
//		System.out.println(person.count);
		
//		Developer d1=new Developer(24,"anuj");
//		d1.walk();
		
		EncapsulationIntro obj=new EncapsulationIntro();
		

	}

}


class Developer extends person       {

	public Developer(int age, String name) {
		super(age, name);
		
	}
	
	void walk() {
		System.out.println("developer " +name+" is walking");
	}
}




class person{
	String name;
	int age;
	static int count;
	void walk() {
		System.out.println(name+" is walking");
	}
	
	
	  public person() { count++; System.out.println("creating an object"); }
	 
	
	public person(int age , String name) {
		
		this.age=age;
		this.name=name;
	}
	void eat() {
		System.out.println(name+" is eating");
	}
	void walk(int steps) {
		System.out.println(name+" walked "+steps +" steps");
	}
	void doWork(){
		System.out.println("person is working");
	}
}
