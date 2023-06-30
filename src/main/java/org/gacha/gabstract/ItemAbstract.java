package org.gacha.gabstract;

import java.util.Map;
import java.util.Set;

public abstract class ItemAbstract {

	/**
	 * 해당 item의 이름
	 */
	public String ItemName;

	/**
	 * 해당 item을 만들기 위해서 필요한 item 이름, [순서 : 아이템이름]
	 */
	public Map<Integer,String> UnderItemName;

	/**
	 * 해당 item으로 만들 수 있는 item 이름, [순서 : 아이템이름]
	 */
	public Map<Integer,String> TopItemName;

	/**
	 * 상위 item이 되기 위해 필요한 값, [상위아이템 이름 : 필요갯수]
	 */
	public Map<String,Integer> NeedValue;

	/**
	 * UnderItemName을 조합해서 자신이 만들어질 확률
	 */
	public double Probability;


}
