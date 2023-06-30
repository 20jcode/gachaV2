package org.gacha.gabstract;

public abstract class UserAbstract {

	protected ItemManagerAbstract itemManager;
	protected GachaManagerAbstract gachaManager;

	public UserAbstract(ItemManagerAbstract itemManger,GachaManagerAbstract gachaManager){
		this.itemManager = itemManger;
		this.gachaManager = gachaManager;
	}
	/**
	 * item에 대한 gacha확률 계산
	 * @param itemName 계산하고자하는 item(만들고자하는 것)
	 *
	 */
	public abstract void calcurate(String itemName);

	/**
	 * 계산되어있는 결과가 있을 경우, 해당 결과를 반환
	 * @param itemName 계산된 item의 결과를 호출
	 * @return 계산결과
	 */
	public abstract String getGachaAns(String itemName);
}
