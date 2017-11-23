package demo.stringDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringDemo {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		String  s = String.format("Duke's Birthday : %1$tm %1$Te %1$tY", c);
		System.out.println(s);
		String s2 = String.format("%1$d", 2343);
		System.out.println(s2);
		String s3 = String.format("%1$20C", new Character('a'));
		System.out.println(s3);
	}
}
