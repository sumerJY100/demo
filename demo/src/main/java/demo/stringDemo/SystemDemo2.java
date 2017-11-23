package demo.stringDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemDemo2 {
	public static void main(String[] args) throws IOException {
//		int a = System.in.read();
//		System.out.println(a);
		int b ;
//		while(( b = System.in.read() )!= -1){
//			System.out.print((char)b);
//		}
		System.out.println(System.in.read());
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
		System.out.println(s);
	}
}
