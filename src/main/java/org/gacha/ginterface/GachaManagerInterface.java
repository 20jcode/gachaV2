package org.gacha.ginterface;

public interface GachaManagerInterface {

	/**
	 *
	 * @param item 뽑기 시뮬레이션을 할 객체
	 * @return 계산결과
	 */
	GachaManagerInterface doGacha(ItemInterface item);
}
