package pach1;

public class ThreadCreationType1AnanomysClass {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.currentThread().getName()+" start");
		Thread  thread=new Thread() {
			
			public void run() {
				System.out.println("go");
				System.out.println(Thread.currentThread().getName());
				//System.out.println(Thread.getPriority());


			}

		};
		thread.start();
		System.out.println(thread.currentThread().getName()+" end");
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());


	}

}
