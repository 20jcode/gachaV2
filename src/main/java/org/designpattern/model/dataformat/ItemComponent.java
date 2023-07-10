package org.designpattern.model.dataformat;

public interface ItemComponent {

	void add();
	void remove();
	String getName();
	Double getProbability(); //TODO : 필요가 없는 부분?
	ItemComponent getChild();

	int getId();


}
