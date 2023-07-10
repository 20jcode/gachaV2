package org.implOPM.model;

import org.designpattern.model.gachaInterface.Probability;

import java.util.Map;

public class ProbabilityImpl implements Probability {


	private Map<Integer,Double> proData;

	@Override
	public void add (int itemId,double num) {

		proData.put(itemId,num);
	}

	@Override
	public void remove (int itemId) {

		proData.remove(itemId);
	}

	@Override
	public double getDatas (int itemId) {

		return proData.get(itemId);
	}
}
