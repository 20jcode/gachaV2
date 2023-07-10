package org.implOPM.model;

import org.designpattern.model.GachaModel;
import org.designpattern.model.dataformat.GachaAns;
import org.designpattern.model.dataformat.ItemComponent;
import org.designpattern.model.gachaInterface.Probability;
import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;
import org.designpattern.model.gachaInterface.SkyRule;
import org.designpattern.model.gachaInterface.UseItem;
import org.implOPM.model.gachalogic.OneAnsGacha;

import java.util.Random;

public class GachaModelImpl implements GachaModel {

	private ItemComponent itemComponent;
	private SkyRule skyRule;

	private UseItem useItem;

	private ProbabilityCorrectionRule probabilityCorrectionRule;
	private GachaAns gachaAns;

	private Random random;

	private OneAnsGacha oneAnsGacha;

	private Probability probability;

	@Override
	public GachaAns doGacha (int itemId) {

		// TODO : 생성 시 어떤 item에 대한 모델인지는 스스로 알아야하지 않을까?


		int correctCount = 0;

		while(isNotEnough(itemId)){

			// 특정횟수 뽑기 시 지급 아이템 연산
			for(int i : skyRule.getSky(itemId,gachaAns.getCount())){
				gachaAns.addItem(i);
			}

			// 뽑기 보정 연산
			if(probabilityCorrectionRule.isCorrect(itemId,correctCount)){
				for(int i : probabilityCorrectionRule.getCorrect(itemId,correctCount)){
					gachaAns.addItem(i);
				}
				gachaAns.countUp();
				correctCount = 0;
			} else { //보정 연산이 아닐 경우 일반 뽑기 실행
				gachaAns.addItem(cal(itemId));
				gachaAns.countUp();
				correctCount += 1;

			}


		}

		return gachaAns;
	}

	private boolean isNotEnough(int itemId){

		for(int i : useItem.getNeedItem(itemId)){
			if(useItem.getNeedItemValue(i) > gachaAns.getItemValue(i)){
				return true; //충분하지 않을 경우
			}
		}
		return false;

	}

	private int cal(int itemId){
		oneAnsGacha = new OneAnsGacha(probability.getData(itemId));


		return oneAnsGacha.getAns();
	}
}
