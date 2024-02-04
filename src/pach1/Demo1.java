package pach1;

public class Demo1 {
	public static void main(String[] args) {
		Thread d=Thread.currentThread();
		System.out.println(d.getName());
		System.out.println(d.getId());
		System.out.println(d.getPriority());
		System.out.println(d.getId());
		for(int i=0;i<5;i++) {
			System.out.println("on");
			System.out.println("off");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}



	}

}
