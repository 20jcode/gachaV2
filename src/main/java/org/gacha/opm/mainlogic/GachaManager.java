package org.gacha.opm.mainlogic;

import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaManagerAbstract;
import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;

public class GachaManager extends GachaManagerAbstract {

	private GachaManager(){}

	public GachaManager(ItemManagerAbstract itemManager){
		super(itemManager);
	}
	@Override
	public void doGacha (ItemAbstract item) {

		//TODO : 구현하기

		//GachaAbstract gacha = new GachaV2();

		//gacha.setIsSky();
		//gacha.setHalfSky();

		//ans.add(gacha.cal());

	}

	@Override
	public String getAnsTop (int num) {return null;}

	@Override
	public String getAnsTopAll () {
		return null;
	}
}
