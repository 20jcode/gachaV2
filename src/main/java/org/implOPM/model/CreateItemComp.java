package org.implOPM.model;

import org.designpattern.model.dataformat.ItemComponent;
import org.implOPM.model.dataformat.ItemComponentLeafImpl;
import org.implOPM.model.dataformat.ItemComponentNodeImpl;

public class CreateItemComp {

	private int itemId = 0;
	ItemComponent opmItemSet(){

		ItemComponent dsk2 = new ItemComponentNodeImpl(id(),"DSK2");
		ItemComponent dsk = new ItemComponentNodeImpl(id(),"DSK");
		ItemComponent evostone = new ItemComponentNodeImpl(id(),"evostone");
		ItemComponent gackstone = new ItemComponentNodeImpl(id(),"gackstone");
		ItemComponent blackTiket = new ItemComponentLeafImpl(id(),"blackTiket");

		dsk2.add(dsk);
		dsk2.add(gackstone);
		dsk2.add(evostone);

		dsk.add(evostone);
		dsk.add(gackstone);

		evostone.add(blackTiket);
		gackstone.add(blackTiket);

		return dsk2;
	}

	private int id(){
		itemId +=1;
		return itemId;
	}
}
