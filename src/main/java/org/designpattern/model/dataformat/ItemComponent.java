package org.designpattern.model.dataformat;

import java.util.Set;

public abstract class ItemComponent {

	public void add(ItemComponent itemComponent){
		throw new UnsupportedOperationException();
	}
	public  void remove(ItemComponent itemComponent){
		throw new UnsupportedOperationException();
	}
	public String getName(){
		throw new UnsupportedOperationException();
	}
	public ItemComponent getChild(int i){
		throw new UnsupportedOperationException();
	}

	public int getId(){
		throw new UnsupportedOperationException();
	}


}
