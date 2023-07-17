package org.designpattern.model.factory;

import org.designpattern.model.dataformat.ItemComponent;
import org.designpattern.model.gachaInterface.Probability;
import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;
import org.designpattern.model.gachaInterface.SkyRule;
import org.designpattern.model.gachaInterface.UseItem;

/**
 * 추상 팩토리 패턴 사용
 */
public interface GachaModelAbstractFactory {


	ItemComponent createItemComp ();
	UseItem createUseItem();
	Probability createProbability();
	ProbabilityCorrectionRule createProbabilityCorrectionRule();
	SkyRule createSkyRule();
}
