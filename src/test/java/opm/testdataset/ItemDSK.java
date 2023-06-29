package opm.testdataset;

import org.gacha.opm.mainlogic.Item;

import java.util.HashSet;

/**
 * 테스트를 위해 만들어진 ItemDSK item 객체입니다.
 */
public class ItemDSK extends Item {

	public ItemDSK (){
		//객체 인스턴스 설정
		this.itemName = "ItemDSK";
		this.forMakeNeedItems = new HashSet<>();
		this.isMoreNeed = true;

		//하위1 객체 설정
		Item item1 = new Item();
		Item item2 = new Item();

		item1.itemName = "evoDSK";
		item2.itemName = "gackDSK";

		item1.forMakeNeedItems = new HashSet<>();
		item2.forMakeNeedItems = new HashSet<>();

		item1.isMoreNeed = true;
		item2.isMoreNeed = true;

		item1.needValue = 4;
		item2.needValue = 1;

		//하위2 객체 설정
		Item item3 = new Item("blacktiket",null,false,0);

		//하위1 <- 하위2
		item1.forMakeNeedItems.add(item3);
		item2.forMakeNeedItems.add(item3);

		//ItemDSK <- 하위1
		this.forMakeNeedItems.add(item1);
		this.forMakeNeedItems.add(item2);
	}
}
