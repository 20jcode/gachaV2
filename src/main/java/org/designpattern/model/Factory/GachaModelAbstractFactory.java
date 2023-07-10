package org.designpattern.model.Factory;

public interface GachaModelAbstractFactory {
	//TODO : 반환타입 수정하기
	//void createGachaModel();
	void createItem();
	void createUseItem();
	void createProbability();
	void createProbabilityCorrectionRule();
	void createSkyRule();
}
