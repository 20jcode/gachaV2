package org.gacha.opm.mainlogic;

import org.gacha.calLogic.OneAnsGacha;
import org.gacha.dataset.GachaData;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaDataAbstract;

import java.util.*;

public class GachaV2 extends GachaAbstract {

	//private GachaV2(){}

	public GachaV2(String itemName,Map<String,Integer> needItemValue,
	               Map<String,Double> itemProbability,Map<Integer,Set<String>> isSky,Map<Integer,Set<String>> isHalfSky){
		super(itemName,needItemValue,itemProbability,isSky,isHalfSky);
	}



	@Override
	public GachaDataAbstract cal () {

		halfSkyCount = 0; // TODO : thread safe 한가?

		GachaDataAbstract gachaData = new GachaData(itemName);

		Set<String> keys = needItemValue.keySet();

		for (String element : keys) { //gachaData에 뽑을 item 이름 넣기
			gachaData.gachaAns.put(element, 0);
			control.put(element, false);
		}


		while (true) {
			// 원하는 아이템을 전부 뽑았는가

			for (String element : keys) { // 필요한 갯수만큼 뽑았다면 true로 바꿔줌
				if (gachaData.gachaAns.get(element) >= needItemValue.get(element)) { //최소치가 만족한 것에 대해서
					control.put(element, true);
				}
			}

			if (!control.containsValue(false)) { // 부족한 것이 없다면 반복문 종료
				break;
			}

			// 뽑기를 함
			gachaData.count += 1;
			halfSkyCount += 1;

			String dogachaAns = oneAnsGacha.getAns();

			if (dogachaAns != null) { // 특정 item을 뽑은 경우 결과에 추가
				gachaData.add(dogachaAns, 1);
				halfSkyCount = 0;
			}

			// 천장일 경우 해당 item 증가

			if (isSky.isSky(gachaData.count)){
				for(String element : isSky.getSky(gachaData.count)){
					gachaData.add(element,1);
				}
			}


			//반천장일 경우 해당 item 증가

			if (isSky.isHalfSky(halfSkyCount)){
				gachaData.add(oneAnsGacha.mustGetAns(),1);
				halfSkyCount = 0;
			}



		}

		return gachaData;

	}
}
