package org.gacha.opm.mainlogic;

import org.gacha.dataset.GachaData;
import org.gacha.gabstract.GachaAbstract;
import org.gacha.gabstract.ItemAbstract;

import java.util.HashSet;
import java.util.Set;

public class Gacha extends GachaAbstract {
	public Gacha (ItemAbstract item) {
		super(item);
	}

	@Override
	public GachaData cal () {

		// isMoreNeed가 false가 나올때까지 재귀적으로 들어감
		// false가 나오면 해당 item이름을 set에 저장
		// set에 저장된 이름들을 각각 뽑기를 진행 - 한 아이템을 소모해서 여러가지 item이 나올 수 있음
		// 뽑기는 needValue가 0이 될떄까지 진행되어야함

		// 뽑기 결과를 GachaData에 저장해서 반환
		Set<String> needs = new HashSet<>();
		findGachaUseItem(item,needs);

		for (String element : needs){
			if (needs.size() == 1){

				return oneItemCal(element);

			} else {
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
	public Set<String> findGachaUseItem (ItemAbstract item,Set<String> ans) {

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
	public GachaData oneItemCal (String itemname) {
		return null;
	}


}
