package pach1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataInconsistancyByWaiting extends Thread {
	//static String name="Harry";
	
	public  void run()   {
		
		System.out.println("start");
			String read="C://Users//Windows 8.1//Desktop//thread.txt";
			try {
				FileInputStream f1=new FileInputStream(read) ;
				int i=0;
				int count=0;
				while((i=f1.read())!=-1) {
					count++;
					System.out.print((char)i);
					if(count==2) {
						Thread.sleep(10000);
						count=0;
					}
					
					
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	
	public static void main(String[] args)  {
		
		DataInconsistancyByWaiting d=new DataInconsistancyByWaiting();
		d.start();

		String write="C://Users//Windows 8.1//Desktop//thread.txt";

		try {
			FileOutputStream f2=new FileOutputStream(write);
			String wr="Potter";
			byte b[]=wr.getBytes();
			f2.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	}
