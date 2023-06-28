package org.gacha.gimplement;

import org.gacha.ginterface.GachaInterface;
import org.gacha.ginterface.ItemInterface;

//TODO : 인터페이스를 현재 Gacha객체에 맞춰서 메소드추출해주기, 멤버변수도 마찬가지?

/**
 * Gacha는 item이름에 따른 확률을 알아야함
 * 특정 item에 대해 소비하는 item을 알아야함
 * return에 대해, 가챠를 1000번 모의실행한다면 1000개의 객체가, 10만번 모의실행한다면 10만개의 객체가 생성?
 * gacha객체 자체의 형태로 return을 한다면 이값을 관리하는 것이 옳은지?
 * static타입으로 하고, 가챠에 대한 확률은 gachaManager에게 받아오는 형식으로 해야할듯?
 *
 * 특정 item에 대한 확률은 Gacha가 알아야함
 */
public class Gacha implements GachaInterface {

	private Set<> // <gacha객체>
	public Gacha(ItemInterface item){
		//TODO : item객체를 받아서 해당 item에 맞는 가챠로직 생성
	}

	/**
	 *
	 * @param args 확률 기입
	 * @return Map<Integer 총뽑기횟수,<String 첫번째 아이템 이름,Integer 뽑은 갯수>,<...>>
	 */
	@Override
	public static String cal (double... args) {



		// 뽑을 아이템 이름들을 입력받는다
		// 해당 item에 대한 확률 값 변수를 검증한다
		// 아이템의 이름들이 서로 다른 소비item이라면 err
		//



		return null;
	}
}
