package org.gacha.gabstract;

import org.gacha.dataset.GachaData;

import java.util.Map;
import java.util.Set;

public abstract class GachaAbstract { //static class?

	public final ItemAbstract item;
	public GachaAbstract(ItemAbstract item){
		this.item = item;
	}

	public abstract void getAns();

	public abstract GachaData cal();

	/**
	 *
	 * @param item 뽑고자하는 item
	 * @return
	 */
	protected static Map<String,Integer> multiGacha(ItemAbstract item){
		return null;
	}

	/**
	 * item을 얻기 위해 무엇을 소비해야하는가
	 * @param item 얻고자 하는 item
	 * @return 얻어야하는 item 이름들
	 */

	public abstract Set<String> findGachaUseItem (ItemAbstract item, Set<String> ans);

	/**
	 * 하나의 item으로 한개 이상의 item이 뽑힐 경우
	 * @param itemName 소모하는 item 이름
	 * @return
	 */
	public abstract GachaData oneItemCal(String itemName);


}
