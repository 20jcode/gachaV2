package org.gacha.opm.mainlogic;

import org.gacha.gabstract.ItemAbstract;

import java.util.Map;
import java.util.Set;

public class Item extends ItemAbstract {

	protected Item(){
		super();
	};
	public Item (String itemName, Map<Integer, String> underItemName, Map<Integer, String> topItemName, Map<String, Integer> needValue, double probability) {
		super(itemName, underItemName, topItemName, needValue, probability);
	}

	
}
