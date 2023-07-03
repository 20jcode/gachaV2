package org.gacha.gabstract;

import java.util.List;
import java.util.Map;

public abstract class ItemManagerAbstract {

	private List<ItemAbstract> items;

	public ItemManagerAbstract(List<ItemAbstract> items){

		this.items = items;
	}

	/**
	 * 1. List 내부에서 item의 이름을 검색
	 * 2. item 객체를 복사해서 반환
	 * @param itemName 원하는 item객체의 이름
	 * @return 복사된 item객체 반환
	 */
	public abstract ItemAbstract getItem(String itemName);

	/**
	 * item의 이름을 입력하면, 해당 item
	 * @param itemName
	 * @return
	 */
	public abstract double getItemProbability(String itemName);


	public abstract Map<String, Integer> getNeedItemValue (String itemName);
}
