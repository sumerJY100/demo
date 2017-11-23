package demo.stringDemo;

public class Test1 {

	private String A;
	private String B;
	
	public static void main(String[] args) {
		new Thread("a"){
			public void run(){
				Test1 test1 = new Test1();
				test1.testA();
				test1.testB();
			}
		}.start();
		
	}
	
	private synchronized void testA(){
		while(true){
			System.out.println("AAAAAA");
			A = "A";
			try {
				Thread.sleep(1000);
				notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	private synchronized void testB(){
		while(true){
			System.out.println("BBBBB");
			B = "B";
			try {
				Thread.sleep(1000);
				notifyAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
