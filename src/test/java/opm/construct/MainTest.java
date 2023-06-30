package opm.construct;

import org.gacha.Controller.ItemSetter;
import org.gacha.dataset.ItemData;
import org.gacha.gabstract.*;
import org.gacha.opm.mainlogic.GachaManager;
import org.gacha.opm.mainlogic.Item;
import org.gacha.opm.mainlogic.ItemManager;
import org.gacha.opm.mainlogic.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

	public ItemAbstract itemDsk;
	public ItemAbstract itemGevo;
	public ItemAbstract itemDsk2gack;
	public ItemAbstract itemDskgackstone;
	public ItemAbstract itemBlacktiket;


	@BeforeEach
	void setUp(){
		ItemAbstract itemDsk = ItemData.dsk();
		ItemAbstract itemGevo = ItemData.gevo();
		ItemAbstract itemDsk2gack = ItemData.dsk2gack();
		ItemAbstract itemDskgackstone = ItemData.DSKgackstone();
		ItemAbstract itemBlacktiket = ItemData.blacktiket();
	}

	@Test
	@DisplayName("처음 프로그램 실행 시 생성자 주입")
	void mainConstructor(){
		//when

		ItemSetter itemSetter = new ItemSetter();
		itemSetter.setItemSet(itemDsk,itemGevo,itemDsk2gack,itemDskgackstone,itemBlacktiket);

		ItemManagerAbstract itemManager = new ItemManager(itemSetter.getItemSet()); //TODO : json형식으로 item 삽입
		GachaManagerAbstract gachaManager = new GachaManager(); //TODO : json형식으로 gacha 삽입

		UserAbstract user = new User(itemManager,gachaManager);

		String itemName = "blacktiket";

		user.calcurate(itemName);

		System.out.println(user.getGachaAns(itemName));


	}
}
