package pach1;

public class Type4ThreadCreation implements Runnable{

	@Override
	public void run() {
		for(int i=0 ;i<10;i++) {
			System.out.println(i);
		}
		
	}

}
