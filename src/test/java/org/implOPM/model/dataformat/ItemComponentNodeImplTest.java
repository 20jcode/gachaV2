package org.implOPM.model.dataformat;

import org.designpattern.model.dataformat.ItemComponent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ItemComponentNodeImplTest {

	@Nested
	@DisplayName("객체 생성")
	class Add {
		ItemComponent itemComponent;

		@Test
		@DisplayName("생성자,get 확인")
		void createTest(){
			//when
			int itemId = 0;
			String itemName = "컴포넌트 0번, 노드";
			//then
			itemComponent = new ItemComponentNodeImpl(itemId,itemName);

			int expectItemId = itemComponent.getId();
			String expectItemName = itemComponent.getName();

			//given
			assertEquals(expectItemId,itemId);
			assertEquals(expectItemName,itemName);

		}

	}
}