package org.gacha.opm.mainlogic;

import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaManagerAbstract;
import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;

import java.util.Map;

public class GachaManager extends GachaManagerAbstract {

	private GachaManager(){}

	public GachaManager(ItemManagerAbstract itemManager){
		super(itemManager);
	}
	@Override
	public void doGacha (ItemAbstract item) {

		GachaAbstract gacha = setUp(item);
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

	@Override
	protected GachaAbstract setUp (ItemAbstract item) {
		try{
			return beforeSetUpGacha.get(item.itemName);
		} catch (NullPointerException e){

			String itemName = item.itemName;
			Map<String,Integer> needItemValue = itemManager.getNeedItemValue(itemName);
			Map<String,Double> itemProbability = itemManager.getItemProbability(itemName);



			GachaAbstract gacha = new GachaV2();
			beforeSetUpGacha.put(item.itemName,gacha);
		}


	}
}
