package org.patterns.adapterpattern;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class EnumerationAdapterTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("I");
		list.add("am");
		list.add("Darren");
		Enumeration e = new IteratorEnumeration((Iterator) list.iterator());
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
