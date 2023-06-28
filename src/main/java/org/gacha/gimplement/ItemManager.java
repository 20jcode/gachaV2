package org.gacha.gimplement;

import org.gacha.ginterface.ItemInterface;
import org.gacha.ginterface.ItemManagerInterface;

import java.util.List;

public class ItemManager implements ItemManagerInterface {

	private List<ItemInterface> items;

	/**
	 * 생성 시 item에 대한 기본 정보를 입력해준다. 뽑을 확률, 소모아이템 등등
	 *
	 * @param items 초기 item들 입력
	 */
	public ItemManager(List<ItemInterface> items){

		this.items = items;
	}

	/**
	 *
	 * @param itemName 얻고자하는 아이템 이름
	 * @return item 객체
	 */
	@Override
	public ItemInterface getItem (String itemName) {

		//TODO : 아이템 들 중에서 itemName이 일치하는 item을 선택해서 리턴(복사해서반환)

		return null;
	}

	/**
	 * 새로운 아이템을 추가한다
	 * @param item 객체
	 */
	public void addItem (ItemInterface item) {

		items.add(item);
	}


}
