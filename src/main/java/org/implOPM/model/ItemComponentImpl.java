package org.implOPM.model;

import org.designpattern.model.dataformat.ItemComponent;

public class ItemComponentImpl implements ItemComponent {

	private String ItemName;


	@Override
	public void add () {

	}

	@Override
	public void remove () {

	}

	@Override
	public int getId () {
		return 0;
	}

	@Override
	public String getName () {
		return null;
	}

	@Override
	public Double getProbability () {
		return null;
	}

	@Override
	public ItemComponent getChild () {
		return null;
	}
}
