package basics;

public class Abstraction {

	public static void main(String[] args) {
		audi a1=new audi();
		a1.start();
	}
}
	
	class audi extends car{

		@Override
		void start() {
			System.out.println("audi is starting");
			
		}
		
	}
	
	class bmw extends car{

		@Override
		void start() {
			System.out.println("bmw is starting");
			
		}
		
	}
	
	
	 abstract class car{
		int price;
		
		abstract void start() ;
	}


