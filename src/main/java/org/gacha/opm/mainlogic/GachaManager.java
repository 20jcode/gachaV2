package org.gacha.opm.mainlogic;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaManagerAbstract;
import org.gacha.gabstract.ItemAbstract;
import org.gacha.gabstract.ItemManagerAbstract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GachaManager extends GachaManagerAbstract {

	private GachaManager(){}

	public GachaManager(ItemManagerAbstract itemManager){

		this.itemManager = itemManager;
	}
	@Override
	public void doGacha (ItemAbstract item) {

		GachaAbstract gacha = setUp(item);
		ans.add(gacha.cal());

	}

	@Override
	public String getAnsTop (int num) {

		return ans.toString();
	}

	@Override
	public String getAnsTopAll () {
		return null;
	}

	@Override
	protected GachaAbstract setUp (ItemAbstract item) {
		try{
			GachaAbstract g = beforeSetUpGacha.get(item.itemName);
			if(g != null){
				return g;
			} else{
				throw new Exception("이전객체없음");
			}
		} catch (Exception e){

			String itemName = item.itemName;
			Map<String,Integer> needItemValue = itemManager.getNeedItemValue(itemName);
			Map<String,Double> itemProbability;
			itemProbability = new HashMap<>();

			for(String s : needItemValue.keySet()){
				itemProbability.put(s,itemManager.getItemProbability(s));
			}

			//TODO : 확장성있게 수정해주기
			Map<Integer, Set<String>> skyRule = new HashMap<>();
			Set<String> sky50 = new HashSet<>();
			sky50.add("evo");
			Set<String> sky120 = new HashSet<>();
			sky120.add("evo");
			Set<String> sky180 = new HashSet<>();
			sky180.add("evo");
			sky180.add("gack");
			skyRule.put(50,sky50);
			skyRule.put(120,sky120);
			skyRule.put(180,sky180);
			Map<Integer,Set<String>> halfSkyRule = new HashMap<>();
			halfSkyRule.put(80,sky180);
			// 여기까지



			GachaAbstract gacha = new GachaV2(itemName,needItemValue,itemProbability,
					skyRule,halfSkyRule);
			beforeSetUpGacha.put(itemName,gacha);

			return gacha;

		}
	}
}
