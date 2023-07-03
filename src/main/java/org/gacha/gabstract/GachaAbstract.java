package org.gacha.gabstract;

import org.gacha.calLogic.IsSky;
import org.gacha.calLogic.OneAnsGacha;

import java.util.*;

public abstract class GachaAbstract { //TODO: 접근권한 수정 필요

	/**
	 * 반복제어용
	 */
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
	/**
	 * 반천장 카운터
	 */
	protected  int halfSkyCount;

	protected IsSky isSky;

	protected OneAnsGacha oneAnsGacha;
	// 생성자
	protected GachaAbstract(){}

	public GachaAbstract(String itemName,Map<String,Integer> needItemValue,Map<String,Double> itemProbability,
	                     Map<Integer,Set<String>> isSky,Map<Integer,Set<String>> isHalfSky){
		this.itemName = itemName;
		this.needItemValue = needItemValue;
		this.itemProbability = itemProbability;
		this.control = new HashMap<>();
		this.oneAnsGacha = new OneAnsGacha(itemProbability);
		this.isSky = new IsSky(isSky,isHalfSky);


	}
	public abstract GachaDataAbstract cal();





}
