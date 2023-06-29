package org.gacha.dataset;

import java.util.HashMap;
import java.util.Map;

public class GachaData {

	public  GachaData(){
		this.gachaUseItemValue = 0;
		this.gachaGetItemValue = new HashMap<>();
	}
	/**
	 * 총 가챠 횟수
	 */
	public int gachaUseItemValue;
	/**
	 * 획득한 item이름 : 갯수
	 */
	public Map<String,Integer> gachaGetItemValue;
}
