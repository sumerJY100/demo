package demo.stringDemo;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class SystemDemo3 {
	public static void main(String[] args) {
		Map<String,String> map = System.getenv();
		for(Entry e:map.entrySet()){
//			System.out.println(e.getKey()+"," +e.getValue());
		}
			
		Properties p = System.getProperties();
		for(Entry e:p.entrySet()){
			System.out.println(e.getKey()+","+e.getValue());
		}
		List list = Collections.EMPTY_LIST;
		
	}
}
