package basics;
import java.io.*;

class AnyVehicle {
   public void move(){
	   System.out.println("vehicle");
      
}
}

class Bike extends AnyVehicle {
   public void move(){
      System.out.println("bike"); 
}
}

public class Polymorphism {

	public static void main(String[] args) {
		AnyVehicle vehicle = new AnyVehicle();
		// In the above statement, as you can see, the object vehicle is of type
		// AnyVehicle
		// But the output of the below statement will be “Bike can move too!!”,
		// because the actual implementation of object ‘vehicle’ is decided during
		// runtime v
		vehicle = new AnyVehicle();
		// Now, the output of the below statement will be “Any vehicle should move!!”,
		vehicle.move();

	}

}
