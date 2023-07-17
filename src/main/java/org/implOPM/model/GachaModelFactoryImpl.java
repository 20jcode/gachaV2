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
	public ItemComponent createItemComp () {

		//TODO : 나중에는 사용자의 데이터 입출력을 받아서 진행될 수 있도록

		CreateItemComp c = new CreateItemComp();

		return c.opmItemSet();

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
