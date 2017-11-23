package demo.stringDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(80);
		while(true){
			System.out.println("accept");
			Socket s = ss.accept();
			InputStream is = s.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = br.readLine();
			System.out.println("str:" + str);
			s.close();
		}
	}
}
