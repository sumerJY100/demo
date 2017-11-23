package demo.stringDemo;

public class Test2 {

	private static String A = "A";
	private static String B = "B";

	public static void main(String[] args) {
		new ClassA().start();
		new ClassB().start();
	}

	static class ClassA extends Thread {
		public void run() {
			synchronized (A) {
				System.out.println("A");
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (B) {
					System.out.println("AB");
					try {
						Thread.sleep(100000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	static class ClassB extends Thread {
		public void run() {
			synchronized (B) {
				System.out.println("B");
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (A) {
					System.out.println("BA");
					try {
						Thread.sleep(100000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
