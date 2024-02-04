package pach1;

import java.util.Scanner;

public class ThreadQuetion2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=20;i++) {
			if(i<10) {
				System.out.println(i);
				//System.out.println(Thread.currentThread().getName()+" befor 10");

			} else if(i>10){
				System.out.println(i);
				//System.out.println(Thread.currentThread().getName()+" after 10");
			}else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadQuetion2 k=new  ThreadQuetion2();
		Thread t=new  Thread(k);
		t.start();
		t.join();
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter 1 no");
		
		System.out.println("enter 2 no");
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<b;i++) {
			System.out.println(i);
		}
		System.out.println(Thread.currentThread().getName()+" which thread");
		

	}

}
