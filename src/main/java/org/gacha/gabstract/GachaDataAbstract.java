package org.gacha.gabstract;

import java.util.HashMap;
import java.util.Map;

public abstract class GachaDataAbstract {

	protected GachaDataAbstract(){} //TODO : 생성자 이런 디자인이 맞나?

	protected  GachaDataAbstract(String itemName){
		this.itemName = itemName;
		this.count = 0;
		this.gachaAns = new HashMap<>();
	}

	public String itemName;
	public int count;
	/**
	 * 얻은 아이템 이름,갯수
	 */
	public Map<String,Integer> gachaAns;

	/**
	 * gachaAns에서 이전의 값을 더해서 저장한다.
	 * @param key Map의 key
	 * @param value Map의 value에 더하고자 하는 값
	 */
	public abstract void add(String key,int value);

}
