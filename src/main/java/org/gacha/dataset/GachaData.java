package org.gacha.dataset;

import org.gacha.gabstract.GachaDataAbstract;

public class GachaData extends GachaDataAbstract {

	private GachaData(){}

	public GachaData(String name){
		super(name);
	}

	@Override
	public void add (String key, int value) {
		int x = gachaAns.get(key);

		gachaAns.put(key,x+value);
	}
}
