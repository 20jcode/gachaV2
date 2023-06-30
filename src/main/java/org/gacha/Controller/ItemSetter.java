package org.gacha.Controller;

import org.gacha.gabstract.ItemAbstract;
import org.gacha.opm.mainlogic.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemSetter {

	private List<ItemAbstract> items;
	public ItemSetter(){
		this.items = new ArrayList<>();
	}

	public void setItemSet(String itemName,
	                       Map<Integer,String> underItemName,
	                       Map<Integer,String> topItemName,
	                       Map<String,Integer> needValue,double probability){
		ItemAbstract item = new Item(itemName,underItemName,topItemName,needValue,probability);

		items.add(item);
	}

	//public void saveJSON(){}

	//public void loadJSON(){}

	public List<ItemAbstract> getItemSet(){
		return items;
	}
}
