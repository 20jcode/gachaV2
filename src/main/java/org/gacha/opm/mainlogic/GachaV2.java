package org.gacha.opm.mainlogic;

import org.gacha.dataset.GachaData;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.ItemAbstract;

import java.util.Set;

public class GachaV2 extends GachaAbstract {

	//TODO : 추상화 필요
	public
	@Override
	public void getAns () {

	}

	@Override
	public GachaData cal () {
		return null;
	}

	@Override
	public Set<String> findGachaUseItem (ItemAbstract item, Set<String> ans) {
		return null;
	}

	@Override
	public GachaData oneItemCal (String itemName) {
		return null;
	}
}
