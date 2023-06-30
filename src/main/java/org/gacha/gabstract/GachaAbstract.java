package org.gacha.gabstract;

import java.util.*;

public abstract class GachaAbstract { //TODO: 접근권한 수정 필요

	public Map<String,Boolean> control;
	/**
	 * 필요한 item 이름, 수량
	 */
	public Map<String,Integer> needItemValue;

	/**
	 * 필요한 item 이름, 뽑을 확률
	 */
	public Map<String,Double> itemProbability;

	/**
	 * 최종적으로 만들어질 item의 이름
	 */
	public String itemName;

	protected Map<Integer,Set<String>> skyRole;

	protected  int halfCount;
	protected Set<String> halfSkyItemName;
	// 생성자
	protected GachaAbstract(){}

	public GachaAbstract(String itemName,Map<String,Integer> needItemValue,Map<String,Double> itemProbability){
		this.itemName = itemName;
		this.needItemValue = needItemValue;
		this.itemProbability = itemProbability;
		this.control = new HashMap<>();
		this.skyRole = new HashMap<>();

	}
	public abstract GachaDataAbstract cal();

	//TODO : isSky를 하나의 클래스로 분리해주기?


	public abstract void setIsSky (int i, Set<String> items);

	/**
	 * 천장(특정 횟수 이상 뽑기 시 item을 얻을 수 있음)인지 확인
	 * @param num 지금까지 뽑기 횟수
	 * @return 획득한 item
	 */
	protected abstract Set<String> isSky(int num);

	public abstract void setHalfSky(int i,Set<String> items);

	protected abstract Set<String> isHalfSky(int num);

	protected abstract String dogacha(Set<String> items);




}
