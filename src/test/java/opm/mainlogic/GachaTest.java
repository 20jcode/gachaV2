package opm.mainlogic;

import opm.testdataset.ItemDSK;
import org.gacha.dataset.GachaData;
import org.gacha.opm.mainlogic.Gacha;
import org.gacha.opm.mainlogic.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class GachaTest {

	@Test
	@DisplayName("어떤 item을 뽑아야하는가 : findGachaUseItem")
	void findGachaUseItemTest(){

		//given

		Item item = new ItemDSK(); //만들고자하는 item

		Gacha gacha = new Gacha(item); //gacha인스턴스 생성

		Set<String> ans = new HashSet<>(); //기대하는 결과

		Set<String> expected = new HashSet<>();

		expected.add("blacktiket");

		//when

		gacha.findGachaUseItem(item,ans);

		//then

		Assertions.assertEquals(expected,ans);



	}

	@Test
	@DisplayName("oneItemCal 정상작동?")
	void oneItemCalTest(){
		Item item = new ItemDSK(); //만들고자하는 item

		Gacha gacha = new Gacha(item); //gacha인스턴스 생성

		GachaData a = gacha.oneItemCal("blacktiket");

		System.out.println(a.gachaGetItemValue);
		System.out.println(a.gachaUseItemValue);
	}


}
