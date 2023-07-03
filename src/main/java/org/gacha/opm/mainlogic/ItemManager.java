package org.gacha.opm.mainlogic;

import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public Map<String, Integer> getNeedItemValue (String itemName) {
		Map<String,Integer> ans = new HashMap<>();

		items.


		return ans;
	}
}
