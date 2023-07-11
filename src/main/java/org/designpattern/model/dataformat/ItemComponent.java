package org.designpattern.model.dataformat;

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
	public Double getProbability(){
		throw new UnsupportedOperationException();
	} //TODO : 필요가 없는 부분?
	public ItemComponent getChild(){
		throw new UnsupportedOperationException();
	}

	public int getId(){
		throw new UnsupportedOperationException();
	}


}
