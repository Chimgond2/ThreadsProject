package pach1;

import java.util.Scanner;

public class ThreadQuetion extends Thread{
	
	public void run() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("sum is "+(a+b));
		System.out.println(Thread.currentThread().getName()+"0");
	}
	public static void main(String[] args) {
		ThreadQuetion h=new ThreadQuetion();
		h.start();
		System.out.println(Thread.currentThread().getName()+"l");
		System.out.println(h.currentThread().getName()+"2");


	}

}
