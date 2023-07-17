package org.implOPM.model;

import org.designpattern.model.dataformat.ItemComponent;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateItemCompTest {

	@Test
	void opmItemSet () {

		CreateItemComp c = new CreateItemComp();
		ItemComponent item = c.opmItemSet();

		System.out.println(item.getChild(0).getChild(0));


	}
}