package org.gacha.gabstract;

import java.util.*;

public abstract class GachaManagerAbstract {

	protected Map<String,GachaAbstract> beforeSetUpGacha;
	protected ArrayList<GachaDataAbstract> ans;

	public ItemManagerAbstract itemManager;

	protected GachaManagerAbstract(){
		ans = new ArrayList<>();
		beforeSetUpGacha = new HashMap<>();
	};

	public GachaManagerAbstract(ItemManagerAbstract itemManager){

		this.itemManager = itemManager;

	}
	public abstract void doGacha(ItemAbstract item);

	/**
	 *
	 * @param num 10단위 구간으로 10 : 상위 0~10%, 20 : 상위 10~20%
	 * @return 해당 구간의 결과를 보여줌
	 */
	public abstract String getAnsTop(int num);

	/**
	 * 계산한 모든 결과를 나타내줌
	 * TODO : 여러 item을 계산하려면 how?
	 * @return 계산결과
	 */
	public abstract String getAnsTopAll();

	/**
	 * Gacha객체 생성
	 * @param item 생성하고자하는 item객체 넣기
	 * @return 생성된 Gacha객체반환
	 */
	protected abstract GachaAbstract setUp(ItemAbstract item);

}
