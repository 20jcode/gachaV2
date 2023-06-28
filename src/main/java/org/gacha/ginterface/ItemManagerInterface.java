package org.gacha.ginterface;

/**
 * 역할 : item들을 관리함.
 * item객체는 외부로 반환시 복사해서 반환하도록
 *
 *
 */
public interface ItemManagerInterface {

	/**
	 *
	 * @param itemName 얻고자하는 아이템 이름
	 * @return 복사된 Item객체
	 */
	ItemInterface getItem (String itemName);

	void addItem (ItemInterface item);


}
