package org.implOPM.model;

import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;

public class ProbabilityCorrectionRuleImpl implements ProbabilityCorrectionRule {
	@Override
	public boolean isCorrect (int itemId, int correctCount) {
		return false;
	}

	@Override
	public int[] getCorrect (int itemId, int correctCount) {
		return new int[0];
	}
}
