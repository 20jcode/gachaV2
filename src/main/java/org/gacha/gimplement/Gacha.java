package org.gacha.gimplement;

import org.gacha.ginterface.GachaInterface;
import org.gacha.ginterface.ItemInterface;

/**
 * Gacha는 item이름에 따른 확률을 알아야함
 * 특정 item에 대해 소비하는 item을 알아야함
 *
 */
public class Gacha implements GachaInterface {

	public Gacha(ItemInterface item){
		//TODO : item객체를 받아서 해당 item에 맞는 가챠로직 생성
	}
	@Override
	public String cal (double... args) {

		// 뽑을 아이템 이름들을 입력받는다
		// 해당 item에 대한 확률 값 변수를 검증한다
		// 아이템의 이름들이 서로 다른 소비item이라면 err
		//



		return null;
	}
}
