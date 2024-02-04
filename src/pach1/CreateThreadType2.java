package pach1;

public class CreateThreadType2 {
	public static void main(String[] args) {
		
	
	Runnable y=()->{
		System.out.println("ok");
	};
	Thread t=new Thread(y);
	t.start();
	Thread t1=new Thread(y,"2nd constructore");
	t1.start();

}
}
