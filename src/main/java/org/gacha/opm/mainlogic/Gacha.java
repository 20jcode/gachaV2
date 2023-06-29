package org.gacha.opm.mainlogic;

import org.gacha.dataset.GachaData;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.ItemAbstract;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Gacha extends GachaAbstract {
	public Gacha (ItemAbstract item) {
		super(item);
	}

	@Override
	public GachaData cal () {

		Set<String> needs = new HashSet<>();

		findGachaUseItem(item,needs); //어떤 item을 사용해서 gacha를 하는가

		for (String element : needs){
			if (needs.size() == 1){ // item 1개를 사용해서 gacha를 하는 경우

				return oneItemCal(element); //gacha진행

			} else { //TODO : 여러아이템으로 만들어야하는 경우 처리해주기
				return null;
			}
		}

		return null;
	}

	/**
	 * 재귀형식으로 구현
	 * 테스트완료
	 * @param item 얻고자 하는 item
	 * @return 얻어야하는 item 이름들
	 */
	@Override
	public Set<String> findGachaUseItem (ItemAbstract item,Set<String> ans) { //TODO : item을 전달할 필요가 없는듯

		if (item.isMoreNeed){
			for (ItemAbstract element : item.forMakeNeedItems) {
				findGachaUseItem(element,ans);
			}
		} else {
			ans.add(item.itemName);
		}
		return null;
	}

	@Override
	public GachaData oneItemCal (String itemName) {

		GachaData ans = new GachaData(); //반환 데이터 객체 생성

		int gachaNum = 0; //지금까지 gacha횟수

		// TODO : 수정 필요
		Random r = new Random();

		double t1 = 0.013333d;
		double t2 = 0.006667d;
		int tnum1 = 0;
		int tnum2 = 0;
		// 여기까지

		while((tnum1<4) && (tnum2<1)){
			if (Objects.equals(itemName, "blacktiket")){
				double randAns = randLogic(r.nextDouble(),t1,t2);
				if (randAns == t1){
					ans.gachaUseItemValue +=1;
					tnum1 += 1;
				}
				if (randAns == t2) {
					ans.gachaUseItemValue +=1;
					tnum2 += 1;
				} else {
					ans.gachaUseItemValue +=1;
				}
			}
		}
		ans.gachaGetItemValue.put("evoDSK",tnum1);
		ans.gachaGetItemValue.put("gackDSK",tnum2);

		return ans;
	}

	public double randLogic(double randnum, double...args) { // double -> int , 오차보정
		// TODO : 폐기예정
		// 오류검사

		// 계산부분
		int underN = 1000000; // 10^6
		int rand = (int)(randnum*1000000); // (int) 연산 먼저 되므로 괄호가 중요함!

		for(double arg : args){
			int toInt = (int)(arg*1000000);

			if ((underN-toInt <= rand) && (rand < underN)){
				return arg;
			} else {
				underN -= toInt;
			}
		}

		return 0;
	}


}
