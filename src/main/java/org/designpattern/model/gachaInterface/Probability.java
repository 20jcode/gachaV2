package org.designpattern.model.gachaInterface;

import java.util.Map;

public interface Probability {

	void add(int itemId,double num);
	void remove(int itemId);
	double getDatas (int itemId);
}
