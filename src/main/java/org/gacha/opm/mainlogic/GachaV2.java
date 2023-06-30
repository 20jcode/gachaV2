package org.gacha.opm.mainlogic;

import org.gacha.dataset.GachaData;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.GachaDataAbstract;

import java.util.*;

public class GachaV2 extends GachaAbstract {

	private GachaV2(){}

	public GachaV2(String itemName,Map<String,Integer> needItemValue,
	               Map<String,Double> itemProbability){
		super(itemName,needItemValue,itemProbability);
	}

	//TODO : 추상화 필요

	@Override
	public GachaDataAbstract cal () {

		int halfSkyCount = 0;

		GachaDataAbstract gachaData = new GachaData(itemName);

		Set<String> keys = needItemValue.keySet();




		for (String element : keys){ //gachaData에 뽑을 item 이름 넣기
			gachaData.gachaAns.put(element,0);
			control.put(element,false);
		}
		boolean b = true;

		while(b){
			for(String element : keys){ // 원하는 item을 전부 뽑았는가?
				if(gachaData.gachaAns.get(element) >= needItemValue.get(element)){
					control.put(element,true);
				}
			}
			// 뽑기를 함
			// TODO : 뽑기 구현
			gachaData.count += 1;
			halfSkyCount += 1;
			String dogachaAns = dogacha(keys);

			if (dogachaAns != null) {
				for (String element : gachaData.gachaAns.keySet()) {
					if (element.compareTo(dogachaAns) == 0) {
						int j = gachaData.gachaAns.get(dogachaAns);
						gachaData.gachaAns.put(dogachaAns, j + 1);
					}
				}
			}

			try {
				for(String element : isSky(gachaData.count)){ //천장일 경우 해당 item 증가
					int i = gachaData.gachaAns.get(element);
					gachaData.gachaAns.put(element,i+1);
				}
			}catch (Exception ignored){}
			try {
				for(String element : isHalfSky(halfSkyCount)){ //반천장일 경우 해당 item 증가
					int i = gachaData.gachaAns.get(element);
					gachaData.gachaAns.put(element,i+1);
				}
			}catch (Exception ignored){}

			if(!control.containsValue(false)){
				b = false;
			}

		}

		return gachaData;


	}
	//TODO : isSky를 하나의 클래스로 분리해주기?
	@Override
	public void setIsSky (int i,Set<String> items) {
		skyRole.put(i,items);
	}

	@Override
	protected Set<String> isSky (int num) {
		return skyRole.get(num);
	}

	@Override
	public void setHalfSky (int i,Set<String> items) {
		halfCount = i;
		halfSkyItemName = items;
	}

	@Override
	protected Set<String> isHalfSky (int num) {
		if (num == halfCount){
			return halfSkyItemName;
		} else {
			return null;
		}
	}

	@Override
	protected String dogacha (Set<String> items) {
		Random rand = new Random();
		double ans = rand.nextDouble();
		Map<Double,String> elements = new HashMap<>();

		int underN = 1000000;
		int randtoInteger = (int)(ans*1000000);

		for(String s : items){
			elements.put(itemProbability.get(s),s);
		}

		for(double element : elements.keySet()){
			int toInt = (int)(element*1000000);

			if ((underN-toInt <= randtoInteger) && (randtoInteger < underN)){
				return elements.get(element);
			} else {
				underN -= toInt;
			}
		}

		return null;
	}
}
