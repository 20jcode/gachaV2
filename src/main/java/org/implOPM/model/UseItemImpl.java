package org.implOPM.model;

import org.designpattern.model.gachaInterface.UseItem;

public class UseItemImpl implements UseItem {
	@Override
	public int[] getNeedItem (int itemId) {
		return new int[0];
	}

	@Override
	public int getNeedItemValue (int itemId) {
		return 0;
	}
}
