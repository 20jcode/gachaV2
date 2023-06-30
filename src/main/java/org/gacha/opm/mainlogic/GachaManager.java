package org.gacha.opm.mainlogic;

import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaManagerAbstract;
import org.gacha.gabstract.ItemAbstract;

public class GachaManager extends GachaManagerAbstract {

	public GachaManager(){

	}
	@Override
	public void doGacha (ItemAbstract item) {

		GachaAbstract gacha = new GachaV2();

		gacha.cal();

		ans.add(gacha.getAns());

	}

	@Override
	public String getAnsTop (int num) {return null;}

	@Override
	public String getAnsTopAll () {
		return null;
	}
}
