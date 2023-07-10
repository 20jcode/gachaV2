package org.designpattern.model.dataformat;

public interface ItemComponent {

	void add();
	void remove();
	String getName();
	Double getProbability();
	ItemComponent getChild();

	int getId();


}
