package demo.stringDemo;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest1 {

	public static void main(String[] args) {
//		Map<String,String> map = Collections.singletonMap("A", "a");
//		for(Entry<String,String> e:map.entrySet()){
//			e.getKey();
//			e.getValue();
//			e.setValue("c");
//		}
		System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");     //系统的最大空间
//		System.out.println("Xmx=" + Runtime.getRuntime()./ 1024.0 / 1024 + "M");     //系统的最大空间

		System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");   //系统的空闲空间

		System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");   //当前可用的总空间
	}

}
