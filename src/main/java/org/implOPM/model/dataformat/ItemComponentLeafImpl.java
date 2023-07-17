package org.implOPM.model.dataformat;

import org.designpattern.model.dataformat.ItemComponent;
import org.designpattern.model.gachaInterface.Probability;
import org.designpattern.model.gachaInterface.ProbabilityCorrectionRule;

public class ItemComponentLeafImpl extends ItemComponent {

	private String itemName;
	private int itemId;

	public ItemComponentLeafImpl(int itemId,String itemName){
		this.itemId = itemId;
		this.itemName = itemName;
	}

	@Override
	public String getName(){
		return itemName;
	}

	@Override
	public int getId(){
		return itemId;
	}
}
