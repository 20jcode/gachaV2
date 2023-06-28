package org.gacha.ginterface;

public interface GachaManagerInterface {

	/**
	 *
	 * @param item 뽑기 시뮬레이션을 할 객체
	 *
	 */
	void doGacha (int testNum, ItemInterface item);

	/**
	 * 가챠의 결과를 String형식으로 변환해서 출력할 수 있도록
	 * @return 계산결과 String으로
	 */

	String toString();


}
