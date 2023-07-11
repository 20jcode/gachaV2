package org.implOPM.model;

import org.designpattern.model.dataformat.ItemComponent;
import org.designpattern.model.factory.GachaModelAbstractFactory;
import org.designpattern.model.gachaInterface.Probability;
import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;
import org.designpattern.model.gachaInterface.SkyRule;
import org.designpattern.model.gachaInterface.UseItem;
import org.implOPM.model.dataformat.ItemComponentNodeImpl;

public class GachaModelFactoryImpl implements GachaModelAbstractFactory {


	@Override
	public ItemComponent createItem () {
		//TODO : 작업 후 로직 정의해주기
		return null;
	}

	@Override
	public UseItem createUseItem () {

		return new UseItemImpl();
	}

	@Override
	public Probability createProbability () {

		return new ProbabilityImpl();
	}

	@Override
	public ProbabilityCorrectionRule createProbabilityCorrectionRule () {

		return new ProbabilityCorrectionRuleImpl();
	}

	@Override
	public SkyRule createSkyRule () {

		return new SkyRuleImpl();
	}
}
