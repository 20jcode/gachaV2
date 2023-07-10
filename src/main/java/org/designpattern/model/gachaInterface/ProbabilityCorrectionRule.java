package org.designpattern.model.gachaInterface;

public interface ProbabilityCorrectionRule {

	/**
	 *  현재 소비하는 item이 확률 보정상태인지
	 * @param itemId 아이템아이디
	 * @param correctCount 뽑기횟수
	 * @return 확률보정 상태일 경우 true
	 */
	boolean isCorrect(int itemId,int correctCount);

	int[] getCorrect(int itemId,int correctCount);
}
