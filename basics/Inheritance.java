package basics;

public class Inheritance {

	public static void main(String[] args) {
		Samsung s1=new Samsung();
		s1.playGames();
		
		Apple a1=new Apple();
		a1.playGames();

	}

}

class Samsung extends MobilePhone{
	void playGames() {
		System.out.println("samsung playing");
	}
}
class Apple extends MobilePhone{
	
}
class MobilePhone{
	boolean hasHeadphoneJack;
	String os;
	int price;
	int dimen;
	
	void playGames() {
		System.out.println("mobile phone playing");
	}
}
