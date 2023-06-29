package org.gacha.gabstract;

import org.gacha.dataset.GachaData;

import java.util.ArrayList;

public abstract class GachaNanagerAbstract {

	// private AnsTop : [[상위 0~10퍼의 평균 뽑기 횟수,[얻은 아이템1 이름,갯수],...],[상위 10~20퍼의...],...]
	// ans : gacha를 통해 나온 결과를 모아둠. Tree구조로 빠른 정렬, key의 중복이 있을 수 있음
	private ArrayList<GachaData> ans;
	private GachaAbstract gacha;

	public abstract void doGacha(ItemAbstract item);

	// ans.append(gacha(item이름))
	// ans sort
	// ans 10개로 나누고 합치기

	public abstract String getAnsTop(int num);

}
