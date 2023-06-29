package org.gacha.gabstract;

import java.util.Set;

public abstract class ItemAbstract {
	//TODO : private로 바꿔주고 메소드로 관리하기
	public ItemAbstract(){};

	public String itemName;
	/**
	 * 제작에 추가적인 item이 필요한지 여부
	 */
	public boolean isMoreNeed;
	/**
	 * 해당 item을 만들기 위해 필요한 item, itemName이 false일 경우 없다.
	 */
	public Set<ItemAbstract> forMakeNeedItems;
	/**
	 * 해당 item이 상위 item으로 조합되기 위해 필요한 갯수
	 */
	public int needValue;

	// TODO : isMoreNeed가 false이면 뽑을 수 없다.(gacha를 통해서 얻을 수 없는 것) 를 구현하기
	public double probability; //뽑을 확률


}
