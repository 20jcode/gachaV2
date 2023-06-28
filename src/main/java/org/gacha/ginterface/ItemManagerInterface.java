package org.gacha.ginterface;

public interface ItemManagerInterface {

	/**
	 *
	 * @param itemName 얻고자하는 아이템 이름
	 * @return Item객체
	 */
	ItemInterface getItem (String itemName);
}
