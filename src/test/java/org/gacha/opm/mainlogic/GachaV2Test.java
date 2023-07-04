package org.gacha.opm.mainlogic;

import org.gacha.dataset.GachaData;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaDataAbstract;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GachaV2Test {

	@Test
	@DisplayName("죽음의 가챠로직검증")
	void calTest(){
		//when
		//GachaManager가 해야할 일 1 : 생성자
		String itemName = "happy";
		Map<String,Integer> needItemValue = new HashMap<>();
		Map<String,Double> itemProbability = new HashMap<>();

		needItemValue.put("Gevo",4);
		itemProbability.put("evo",0.013333d);
		needItemValue.put("gack",1);
		itemProbability.put("gack",0.006667d);

		//GachaManager가 해야할 일 2 : setIsSky();

		Map<Integer,Set<String>> skyRule = new HashMap<>();

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

		//GachaManager가 해야할일 3 : setHalfSky();

		Map<Integer,Set<String>> halfSkyRule = new HashMap<>();

		halfSkyRule.put(80,sky180);



		GachaAbstract gachaV2 = new GachaV2(itemName,needItemValue,
				itemProbability,skyRule,halfSkyRule);


		//then
		GachaDataAbstract gachaData = gachaV2.cal();

		System.out.println(gachaData.count);
		System.out.println(gachaData.gachaAns.toString());



	}
}