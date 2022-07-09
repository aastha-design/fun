package encapsulation;

public class LearnEncapsulation {

	public static void main(String[] args) {
		Secret obj=new Secret();
		obj.setData(2345);
		
		obj.getData();

	}

}

class Secret{
	private int data;
	
	public void setData(int data) {
		if(data>100) {
		this.data=data;
		}
	}
	public int getData(){
		return data;
	}
	
}