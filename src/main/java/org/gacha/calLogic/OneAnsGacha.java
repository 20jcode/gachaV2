package org.gacha.calLogic;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 한가지 아이템을 소비하여 여러 아이템들 중 하나를 확률적으로 얻을 경우 계산
 * Gacha 객체 내부에서 사용되어짐.
 *
 */
public class OneAnsGacha {

	public final int CRCINTONE = 1000000;
	private Map<String,Integer> toIntItemProbability;
	private Random random;

	protected OneAnsGacha(){}

	public OneAnsGacha(Map<String,Double> itemProbability){
		this.random = new Random();
		toIntItemProbability = new HashMap<>();

		for(String element : itemProbability.keySet()) {
			int convertInt = (int)(itemProbability.get(element)* CRCINTONE);
			toIntItemProbability.put(element,convertInt);
		}
	}

	//TODO: Probability가 1을 넘는 경우 error 처리해주기

	/**
	 * 현재 객체의 확률값을 활용하여 어떤 item을 뽑는지 결과를 반환
	 * 아무것도 뽑히지 않을 경우 null을 반환한다.
	 * @return 뽑은 item의 이름
	 */
	public String getAns() {

		int randNumber = (int)(random.nextDouble()* CRCINTONE); // 랜덤값 생성

		int value = CRCINTONE; // 비교를 위한 초기값 생성

		for(String s : toIntItemProbability.keySet()){

			// 1-이전구간 확률 > randNumber >= 1-현재구간 확률
			int nowPbl = toIntItemProbability.get(s);

			if ((value>randNumber) && (randNumber>=value-nowPbl)){
				return s;
			} else{
				value -= nowPbl;
			}
		}

		return null;
	}

	public String mustGetAns() {
		String s;

		do {
			s = getAns();
		} while (s == null);

		return s;
	}

}
