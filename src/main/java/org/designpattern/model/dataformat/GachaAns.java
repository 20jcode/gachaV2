package org.designpattern.model.dataformat;

public interface GachaAns {

	/**
	 * 획득한 아이템을 추가한다.
	 * @param itemId 획득한 itemId
	 */
	void addItem(int itemId);

	int getItemValue(int itemId);

	void countUp();

	int getCount();



}
