package org.gacha.gimplement;

import org.gacha.ginterface.GachaManagerInterface;
import org.gacha.ginterface.ItemInterface;
import org.gacha.ginterface.ItemManagerInterface;
import org.gacha.ginterface.UserInterface;

public class User implements UserInterface {

	private final ItemManagerInterface itemManager;
	private final GachaManagerInterface gachaManager;


	public User(ItemManagerInterface itemManager, GachaManagerInterface gachaManager){ //TODO : 초기 데이터 포멧을 위한 생성자 만들어주기(생성자주입)

		this.itemManager = itemManager;
		this.gachaManager = gachaManager;
	}
	@Override
	public String calcurate(String itemName){

		ItemInterface item = itemManager.getItem(itemName);

		//TODO : User가 일부 Item을 가지고 있을 때도 계산할 수 있도록

		gachaManager.doGacha(item);

		return gachaManager.toString();
	}
}
