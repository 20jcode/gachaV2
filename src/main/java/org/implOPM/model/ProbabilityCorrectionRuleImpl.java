package org.implOPM.model;

import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;

import java.util.*;

public class ProbabilityCorrectionRuleImpl implements ProbabilityCorrectionRule {

	//소모하는 아이템과 현재 소모 횟수를 입력하면, 확률 보정이 어떻게 되는지를 출력해냄.

	private Map<Integer, Set<Integer>> getItems;

	public ProbabilityCorrectionRuleImpl(){
		getItems = new HashMap<>();
	}

	@Override
	public boolean isCorrect (int itemId, int correctCount) {
		return false;
	}

	@Override
	public int[] getCorrect (int itemId, int correctCount) {
		return new int[0];
	}

	@Override
	public void add (int itemId, int correctCount) {





		}
	}

	@Override
	public void remove (int itemId) {

	}


}
