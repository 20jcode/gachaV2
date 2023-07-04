package org.gacha.calLogic;

import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;
import org.gacha.opm.mainlogic.Item;

import java.util.HashMap;
import java.util.Map;

public class ItemFinder {

	private final Map<String,Integer> data;

	private final ItemManagerAbstract itemManagerAbstract;
	public ItemFinder(ItemManagerAbstract itemManagerAbstract){
		data = new HashMap<>();
		this.itemManagerAbstract = itemManagerAbstract;
	}

	protected Map<String,Integer>  findNeedItemName (String itemName){

		ItemAbstract item = itemManagerAbstract.getItem(itemName);

		if(item.underItemName == null){ //하위 item이 존재하지 않는 경우
				for(int element : item.topItemName.keySet()){//상위 아이템 이름 저장
					data.put(item.topItemName.get(element),null);
				}
		} else{
			for(int i : item.underItemName.keySet()){ //하위 item이 존재

				findNeedItemName(item.underItemName.get(i));
			}

		}

		return data;
	}

	public Map<String,Integer> findNeedItem(String itemName){

		Map<String,Integer> data = findNeedItemName(itemName);

		for(String s : data.keySet()){
			ItemAbstract item = itemManagerAbstract.getItem(s);

			data.put(s,item.needValue.get(s));
		}

		return data;
	}
}
