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

		int count = 0;
		int correctCount = 0;

		while(isEnough()){

			// 특정횟수 뽑기 시 지급 아이템 연산
			gachaAns.addItem(skyRule.getItem(itemId,count));

			// 뽑기 보정 연산
			if(probabilityCorrectionRule.isCorrect(itemId,correctCount)){
				gachaAns.addItem(probabilityCorrectionRule.getItem(itemId,correctCount));
				count += 1;
				correctCount = 0;
			} else { //보정 연산이 아닐 경우 일반 뽑기 실행
				gachaAns.addItem(cal());
				count += 1;
				correctCount += 1;

			}


		}

		return gachaAns;
	}

	private boolean isEnough(int itemId){
		if(useItem.getNeedItemSet(itemId) <= gachaAns.getHaveItemSet(itemId)){ //equal 처리해주기
			//반복자 패턴 넣어주기
			//충분한 경우
			return false;
		} else{
			return true;
		}
	}

	private String cal(){
		oneAnsGacha = new OneAnsGacha(probability.getdata());


		return oneAnsGacha.getAns();
	}
}
