package org.designpattern.model.dataformat;

public interface GachaAns {

	/**
	 * 획득한 아이템을 추가한다.
	 * @param itemId 획득한 itemId
	 */
	void addItem(int itemId);

	/**
	 * 가지고 있는 item의 갯수 반환
	 * @param itemId 가지고 있는(뽑은) itemId
	 * @return 가지고 있는 갯수, null일 경우 0
	 */
	int getItemValue(int itemId);

	void countUp();

	/**
	 * 현재 item을 소모하며 뽑기를 진행한 횟수 반환
	 * @return 총 뽑기 횟수
	 */
	int getCount();



}
