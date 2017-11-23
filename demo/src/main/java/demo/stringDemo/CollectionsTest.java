package demo.stringDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionsTest implements Iterable<CollectionsTest>{

	private List<CollectionsTest> list = new ArrayList<CollectionsTest>();
	
	@Override
	public Iterator<CollectionsTest> iterator() {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.iterator();
		return list.iterator();
	}



}
