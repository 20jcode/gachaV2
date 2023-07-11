package org.implOPM.model.dataformat;

import org.designpattern.model.dataformat.ItemComponent;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ItemComponentNodeImplTest {

	@Nested
	@DisplayName("객체 생성")
	class Add {
		ItemComponent itemComponent;

		int itemId0 = 0;
		String itemName0 = "컴포넌트 0번, 노드";

		int itemId1 = 1;
		String itemName1 = "컴포넌트 1번, 노드";

		int itemId2 = 2;
		String itemName2 = "컴포넌트 2번, 노드";


		@Test
		@DisplayName("생성자,get")
		void createTest(){
			//given

			//when
			itemComponent = new ItemComponentNodeImpl(itemId0, itemName0);

			int expectItemId = itemComponent.getId();
			String expectItemName = itemComponent.getName();

			//then
			assertEquals(expectItemId, itemId0);
			assertEquals(expectItemName, itemName0);

		}

		@Test
		@DisplayName("method : add")
		void addTest(){
			//자식노드를 추가하는 부분

			//given
			ItemComponent test0 = new ItemComponentNodeImpl(itemId0,itemName0);
			ItemComponent test1 = new ItemComponentNodeImpl(itemId1,itemName1);
			ItemComponent test2 = new ItemComponentNodeImpl(itemId2,itemName2);

			//when
			test0.add(test1);
			test0.add(test2);
			ItemComponent expect1 = test0.getChild(0);
			ItemComponent expect2 = test0.getChild(1);

			//then

			assertEquals(expect1,test1);
			assertEquals(expect2,test2);

		}

	}
}