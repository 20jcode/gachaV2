package org.gacha.opm.mainlogic;

import org.gacha.gabstract.ItemAbstract;

import java.util.Set;

public class Item extends ItemAbstract {

	public Item(){};
	public Item(String itemName, Set<ItemAbstract> forMakeNeedItems, boolean isMoreNeed, int needValue,
	            double probability){

		this.itemName = itemName;
		this.forMakeNeedItems = forMakeNeedItems;
		this.isMoreNeed = isMoreNeed;
		this.needValue = needValue;
		this.probability = probability;

	}
}
