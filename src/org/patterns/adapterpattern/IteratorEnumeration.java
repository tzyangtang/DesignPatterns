package org.patterns.adapterpattern;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {

	Iterator iterator;

	public IteratorEnumeration(Iterator iter) {
		iterator = iter;
	}

	@Override
	public boolean hasMoreElements() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		// TODO Auto-generated method stub
		return iterator.next();
	}

}
