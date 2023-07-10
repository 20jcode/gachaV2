package org.implOPM.model;

import org.designpattern.model.dataformat.ItemComponent;
import org.designpattern.model.factory.GachaModelAbstractFactory;
import org.designpattern.model.gachaInterface.Probability;
import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;
import org.designpattern.model.gachaInterface.SkyRule;
import org.designpattern.model.gachaInterface.UseItem;

public class GachaModelFactoryImpl implements GachaModelAbstractFactory {


	@Override
	public ItemComponent createItem () {

		return null;
	}

	@Override
	public UseItem createUseItem () {

		return null;
	}

	@Override
	public Probability createProbability () {

		return null;
	}

	@Override
	public ProbabilityCorrectionRule createProbabilityCorrectionRule () {

		return null;
	}

	@Override
	public SkyRule createSkyRule () {

		return null;
	}
}
