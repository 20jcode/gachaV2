package org.gacha.gabstract;

import java.util.Map;
import java.util.Set;

public abstract class ItemAbstract {

	protected ItemAbstract(){}; //기본생성자를 통한 객체 생성 막기
	public ItemAbstract (String itemName, Map<Integer, String> underItemName, Map<Integer, String> topItemName, Map<String, Integer> needValue, double probability) {
		this.itemName = itemName;
		this.underItemName = underItemName;
		this.topItemName = topItemName;
		this.needValue = needValue;
		this.probability = probability;
	}

	/**
	 * 해당 item의 이름
	 */
	public String itemName;

	/**
	 * 해당 item을 만들기 위해서 필요한 item 이름, [순서 : 아이템이름]
	 */
	public Map<Integer,String> underItemName;

	/**
	 * 해당 item으로 만들 수 있는 item 이름, [순서 : 아이템이름]
	 */
	public Map<Integer,String> topItemName;

	/**
	 * 상위 item이 되기 위해 필요한 값, [상위아이템 이름 : 필요갯수]
	 */
	public Map<String,Integer> needValue;

	/**
	 * UnderItemName을 조합해서 자신이 만들어질 확률
	 */
	public double probability;


}
