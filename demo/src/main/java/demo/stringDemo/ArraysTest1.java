package demo.stringDemo;

import java.util.Arrays;
import java.util.List;

public class ArraysTest1 {

	public static void main(String[] args) {
		String[] arr = new String[]{"A","B","C"};
		List<String> list = Arrays.asList(arr);
		list.add("D");
	}

}
