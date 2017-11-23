package demo.stringDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {

	private static List<String> list = new ArrayList<String>();
	static{
		list = Collections.synchronizedList(list);
	}
	public static void main(String[] args) {
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TA().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		new TB().start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list.toString());
		System.out.print(list.lastIndexOf("A"));
	}
	
	static class TA extends Thread{
		public void run(){
			for(int i=0;i<1000;i++){
				list.add("A");
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
	}
	static class TB extends Thread{
		public void run(){
			for(int i=0;i<1000;i++){
				list.add("B");
//				try {
//					Thread.sleep(1);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		}
	}
}
