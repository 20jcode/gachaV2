package org.gacha.Controller;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.gacha.gabstract.ItemAbstract;
import org.gacha.opm.mainlogic.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class ItemSetterTest {

	@Test
	@DisplayName("아이템의 추가 확인")
	void setItemSet () {

		//given
		String itemName = "DSK";
		Map<Integer,String> underItemName = new HashMap<>();
		underItemName.put(0,"Gevo");
		underItemName.put(1,"DSKgack");

		Map<Integer,String> topItemName = new HashMap<>();
		topItemName.put(0,"DSK2gack");

		Map<String,Integer> needValue = new HashMap<>();
		needValue.put("DSK2gack",1);

		double probability = 1d;

		ItemAbstract item = new Item(itemName,underItemName,topItemName,needValue,probability);

		//when

		ItemSetter itemSetter = new ItemSetter();
		itemSetter.setItemSet(itemName,underItemName,topItemName,needValue,probability);

		ItemAbstract ans = itemSetter.getItemSet().get(0);

		//then

		boolean isEqual = EqualsBuilder.reflectionEquals(ans,item);

		Assertions.assertTrue(isEqual);
	}


}