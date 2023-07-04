package org.gacha.opm.mainlogic;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.gacha.calLogic.ItemFinder;
import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemManager extends ItemManagerAbstract {



	public ItemManager(List<ItemAbstract> items){

		super(items);
		this.itemFinder = new ItemFinder(this);
		//TODO : 이런식의 참조가 가능할까?
	};

	@Override
	public ItemAbstract getItem (String itemName) {
		for(ItemAbstract i : items){
			if(EqualsBuilder.reflectionEquals(i.itemName,itemName)){
				return i;
			}
		}
		System.out.println("getItem : 일치하는 item이 없습니다");
		return null;
	}

	@Override
	public double getItemProbability (String itemName) {
		ItemAbstract item = getItem(itemName);

		return item.probability;

	}

	@Override
	public Map<String, Integer> getNeedItemValue (String itemName) {

		return itemFinder.findNeedItem(itemName);
	}
}
