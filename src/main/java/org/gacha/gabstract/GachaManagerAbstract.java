package org.gacha.gabstract;

import org.gacha.dataset.GachaData;

import java.util.ArrayList;

public abstract class GachaManagerAbstract {

	// private AnsTop : [[상위 0~10퍼의 평균 뽑기 횟수,[얻은 아이템1 이름,갯수],...],[상위 10~20퍼의...],...]

	private ArrayList<GachaData> ans;
	// ans : gacha를 통해 나온 결과를 모아둠. Tree구조로 빠른 정렬, key의 중복이 있을 수 있음
	private GachaAbstract gacha;

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

}