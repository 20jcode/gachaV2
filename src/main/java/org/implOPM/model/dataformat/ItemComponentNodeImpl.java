package org.implOPM.model.dataformat;

import org.designpattern.model.dataformat.ItemComponent;

import java.util.LinkedList;
import java.util.List;

public class ItemComponentNodeImpl extends ItemComponent {

	private String ItemName;
	private List<ItemComponent> itemList = new LinkedList<>();

	private int ItemId;

	@Override
	public void add(ItemComponent itemComponent){
		itemList.add(itemComponent);
	}
	@Override
	public void remove(ItemComponent itemComponent){
		itemList.remove(itemComponent);
	}


}
