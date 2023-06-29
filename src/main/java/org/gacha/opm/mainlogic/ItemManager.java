package org.gacha.opm.mainlogic;

import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;

import java.util.List;

public class ItemManager extends ItemManagerAbstract {

	public ItemManager(List<ItemAbstract> items){
		super(items);
	};

	@Override
	public ItemAbstract getItem (String itemName) {
		return null;
	}

	@Override
	public double getItemProbability (String itemName) {
		return 0;
	}
}
