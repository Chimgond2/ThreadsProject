package pach1;

public class type4MainMethod {
	public static void main(String[] args) {
		Type4ThreadCreation n=new  Type4ThreadCreation();
		Thread d=new  Thread(n);
		d.start();
	}

}
