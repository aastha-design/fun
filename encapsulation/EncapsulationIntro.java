package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		laptop l1=new laptop();
		l1.setRam(8);
		System.out.println(l1.getRam());
		l1.setPrice(31);
		
		System.out.println(l1.getPrice());

	}
	 
	 }
class laptop{
	 int ram; 
	 private int price;
	 
	 
	 public void setPrice (int price) {
		 //is the user an admin
		 boolean isAdmin=true;
		 if(!isAdmin) {
			 System.out.println("not allowed to change");  
		 }else {
			 this.price=price;
		 }
		 
		
	 }


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getPrice() {
		return price;
	}
	 

}
