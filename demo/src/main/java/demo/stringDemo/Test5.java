package demo.stringDemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test5 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",80);
		OutputStream os = s.getOutputStream();
		OutputStreamWriter osr = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osr);
		bw.write("hello world!");
		bw.flush();
		bw.close();
		osr.close();
		os.close();
		s.close();
	}
}
