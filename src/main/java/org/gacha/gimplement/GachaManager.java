package org.gacha.gimplement;

import org.gacha.ginterface.GachaInterface;
import org.gacha.ginterface.GachaManagerInterface;
import org.gacha.ginterface.ItemInterface;

import java.util.Map;

/**
 * 가챠매니저는 가챠 결과에 대해 알아야함
 *
 */
public class GachaManager implements GachaManagerInterface {

	private GachaInterface gacha;
	private Map<Integer, Map<Integer,Integer>> gachaANS; //TODO: LinkedHashMap으로 키를 중복할 수 있도록 해야함


	public GachaManager(GachaInterface gacha){
		this.gacha = gacha;
	}

	@Override
	public void doGacha (int testNum, ItemInterface item) {

		//여기서 item을 입력받을 필요가 있을까?
		//TODO : 가챠 조건 설정

		//TODO : 테스트 횟수만큼 반복

		//TODO : 스레드로 분할해서 테스트 진행
		//gachaANS.추가 (결과(총 뽑기횟수,얻은갯수1,얻은개수2) = gacha.multiGacha(확률:얻어야하는 갯수,확률:얻어야하는 갯수));

		//TODO : gachaANS 정렬

	}

	@Override
	public String toString(){
		return null;
	}



}
