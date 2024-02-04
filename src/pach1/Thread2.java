package pach1;

import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		for(int i=a;i<b;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
