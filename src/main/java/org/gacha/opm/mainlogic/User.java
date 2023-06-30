package org.gacha.opm.mainlogic;

import org.gacha.gabstract.GachaManagerAbstract;
import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;
import org.gacha.gabstract.UserAbstract;

public class User extends UserAbstract {

	public User(ItemManagerAbstract itemManager, GachaManagerAbstract gachaManager){
		super(itemManager,gachaManager);
	}
	@Override
	public void calcurate (String itemName) {
		ItemAbstract item = itemManager.getItem(itemName);
		gachaManager.doGacha(item);
	}

	@Override
	public String getGachaAns (String itemName) {

		ItemAbstract item = itemManager.getItem(itemName);

		return gachaManager.getAnsTopAll();
	}
}
