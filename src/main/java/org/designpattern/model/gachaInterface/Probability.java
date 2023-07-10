package org.designpattern.model.gachaInterface;

import java.util.Map;

public interface Probability {

	void add();
	void remove();
	Map<Integer,Double> getData(int itemId);
}
